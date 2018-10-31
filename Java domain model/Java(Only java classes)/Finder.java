
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Finder extends DomainEntity {

	private String	query;
	private Money	minPrice;
	private Money	maxPrice;
	private Date	startDate;
	private Date	endDate;


	@NotBlank
	public String getQuery() {
		return this.query;
	}

	public void setQuery(final String query) {
		this.query = query;
	}

	public Money getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(final Money minPrice) {
		this.minPrice = minPrice;
	}

	public Money getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final Money maxPrice) {
		this.maxPrice = maxPrice;
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

}
