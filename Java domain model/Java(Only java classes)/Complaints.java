
package domain;

import javax.persistence.Column;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Complaints extends DomainEntity {

	private String	ticker;		// notBlank unique 
	private String	moment;		//past
	private String	description;	//notBlank
	private String	attachments;


	@NotBlank
	@Column(name = "ticker", unique = true)
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@Past
	public String getMoment() {
		return this.moment;
	}

	public void setMoment(final String moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	public String getAttachments() {
		return this.attachments;
	}
	public void setAttachments(final String attachments) {
		this.attachments = attachments;
	}

}
