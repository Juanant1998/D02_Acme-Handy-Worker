
package domain;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	private String	name;	// notBlank  unique


	@NotBlank
	@Column(name = "name", unique = true)
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
