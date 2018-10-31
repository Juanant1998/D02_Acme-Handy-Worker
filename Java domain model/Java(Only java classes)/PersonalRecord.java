
package domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class PersonalRecord extends DomainEntity {

	private String	fullName;		//notBlank
	private String	photo;
	private String	phoneNumber;	//pattern
	private String	linkedin;


	@NotBlank
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}
	public String getPhoto() {
		return this.photo;
	}
	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Pattern(regexp = "d+")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@URL
	public String getLinkedin() {
		return this.linkedin;
	}

	public void setLinkedin(final String linkedin) {
		this.linkedin = linkedin;
	}

}
