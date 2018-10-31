
package domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

public class Money extends DomainEntity {

	private Double	amount;	// min  0 Digits(9,2)
	private String	currency;	// not blank


	@Min(0)
	@Digits(integer = 9, fraction = 2)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(final Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

}
