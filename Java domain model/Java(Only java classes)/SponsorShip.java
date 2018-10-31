
package domain;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.URL;

public class SponsorShip extends DomainEntity {

	/*
	 * The credit card must be a class
	 * that stores :type ,number
	 * date, code and a valid()
	 */

	private String	banner;	//url
	private String	targetPage;	//url
	private Float	creditCard; // notBlank creditCardNumber


	@URL
	public String getBanner() {

		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}

	@URL
	public String getTargetPage() {
		return this.targetPage;
	}

	public void setTargetPage(final String targetPage) {
		this.targetPage = targetPage;
	}
	@CreditCardNumber
	public Float getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final Float creditCard) {
		this.creditCard = creditCard;
	}

}
