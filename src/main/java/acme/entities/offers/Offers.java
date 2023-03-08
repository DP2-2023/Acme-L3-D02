
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
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
public class Offers extends AbstractEntity {

	//Serialisation identifier-----------------------------------------

	protected static final long	serialVersionUID	= 1L;

	//Attributes----------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	protected Date				moment;

	@NotBlank
	@Length(max = 76)//@Length(min=1, max = 76)
	protected String			heading;

	@NotBlank
	@Length(max = 76)
	protected String			summary;

	@Future
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				fechaInicioOferta;

	@Future
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				fechaFinalOferta;

	@Min(0)
	protected Double			price;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
