
package acme.entities.lectures;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 76)
	protected String			title;

	@NotBlank
	@Length(max = 101)
	protected String			abstractSummary;

	@Positive
	protected double			learningTime;

	@NotBlank
	@Length(max = 101)
	protected String			body;

	protected LectureType		type;

	@URL
	protected String			furtherInformation;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
