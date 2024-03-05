
package acme.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Risk extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Pattern(regexp = "R-[0-9]{3}")
	private String				reference;

	@NotBlank
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	private Date				date;

	@Positive
	@NotBlank
	private Double				probability;

	@NotBlank
	private Double				value;

	@NotBlank
	@Length(max = 100)
	private String				description;

	@URL
	private String				link;

}
