
package acme.entities.practicums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import acme.roles.Company;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Practicum extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}", message = "{validation.practicum.code}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			resume; //abstract es especial, por eso el sinonimo

	@NotBlank
	@Length(max = 100) //como es mas corto estrico de 101, son 100
	protected String			goals;

	//La validacion se hace luego en el controller
	protected Double			estimatedTotalTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
	// esta es la que depende de nacho luego
	//	@NotNull
	//	@ManyToOne(optional = false)
	//	protected Course			course;

	@NotNull
	@Valid //se pondría?
	@ManyToOne(optional = false)
	protected Company			company;
}
