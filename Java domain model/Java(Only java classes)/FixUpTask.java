
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class FixUpTask extends DomainEntity {

	private String	ticker;		//notBlank
	private String	description;	//NotBLank
	private String	address;		//NotBlank
	private String	maximumPrice;
	private Date	startDate;
	private Date	endDate;
	private Date	moment;			//past


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}
	@NotBlank
	public String getMaximumPrice() {
		return this.maximumPrice;
	}

	public void setMaximumPrice(final String maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

}
