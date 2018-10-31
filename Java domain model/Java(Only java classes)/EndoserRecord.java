
package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class EndoserRecord extends DomainEntity {

	private String	fullendoserName;	//notBlank
	private String	email;				//email
	private String	phoneNumber;		//pattern
	private String	comment;


	@NotBlank
	public String getFullendoserName() {
		return this.fullendoserName;
	}

	public void setFullendoserName(final String fullendoserName) {
		this.fullendoserName = fullendoserName;
	}
	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}
	//@Pattern(regexp = "d+")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getComments() {
		return this.comment;
	}
	public void setComments(final String comments) {
		this.comment = comments;
	}

}
