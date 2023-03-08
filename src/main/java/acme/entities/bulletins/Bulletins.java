
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletins extends AbstractEntity {

	//Serialisation identifier-----------------------------------------

	protected static final long	serialVersionUID	= 1L;

	//Attributes----------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	protected Date				moment;

	@NotBlank
	@Length(max = 76)//@Length(min=1, max = 76)
	protected String			title;

	@NotBlank
	@Length(max = 101)//mirar si habría que poner min y si seria 100, 101 o 102
	protected String			message;

	protected Boolean			critical;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
