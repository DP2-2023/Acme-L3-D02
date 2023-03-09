
package acme.entities.courses;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.lectures.Lecture;
import acme.entities.lectures.LectureType;
import acme.framework.components.datatypes.Money;
import acme.framework.data.AbstractEntity;
import acme.roles.Lecturer;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3} [0-9]{3}", message = "{validation.course.code}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstractSummary;

	@NotNull
	@Valid
	protected Money				price;

	@URL
	protected String			furtherInformation;

	// Derived attributes -----------------------------------------------------


	@Transient
	public CourseType courseType() {
		final CourseType result;

		final int totalNumberOfLectures = this.lectures.size();
		final int numberOfTheoreticalLectures = (int) this.lectures.stream().filter(x -> x.getType() == LectureType.THEORETICAL).count();

		final int numberOfHandsOnLectures = totalNumberOfLectures - numberOfTheoreticalLectures;

		if (numberOfHandsOnLectures > numberOfTheoreticalLectures)
			result = CourseType.HANDS_ON;
		else if (numberOfHandsOnLectures < numberOfTheoreticalLectures)
			result = CourseType.THEORETICAL;
		else
			result = CourseType.BALANCED;

		return result;
	}

	// Relationships ----------------------------------------------------------


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Lecturer		lecturer;

	@NotNull
	@Valid
	@ManyToMany()
	protected Set<Lecture>	lectures;

}
