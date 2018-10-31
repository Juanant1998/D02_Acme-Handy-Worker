
package domain;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Application extends DomainEntity {

	private Date				date;						//past
	private String				status;					//notBlank pattern 
	private String				offeredPrice;
	private String				comments;					//notBlank

	public static final String	PENDING		= "PENDING";
	public static final String	ACCEPTED	= "ACCEPTED";
	public static final String	REJECTED	= "REJECTED";


	@Past
	public Date getDate() {
		return this.date;
	}
	public void setDate(final Date date) {
		this.date = date;
	}
	@NotBlank
	@Pattern(regexp = "^" + Application.ACCEPTED + "|" + Application.PENDING + "|" + Application.REJECTED + "$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}
	public String getOfferedPrice() {
		return this.offeredPrice;
	}
	public void setOfferedPrice(final String offeredPrice) {
		this.offeredPrice = offeredPrice;
	}
	@NotBlank
	public String getComments() {
		return this.comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

}
