
package acme.entities.banner;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	protected Date				moment;

	@NotNull
	protected Date				display;

	@NotBlank
	@URL
	protected String			linkPicture;

	@NotBlank
	@Length(min = 0, max = 75)
	protected String			slogan;

	@NotBlank
	@URL
	protected String			linkTarget;
}
