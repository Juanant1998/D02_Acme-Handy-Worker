
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Curriculum extends DomainEntity {

	private String	ticker;	//notBlank


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

}
