
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Report extends DomainEntity {

	private Date	date;			// past
	private String	description;	//notBlank
	private String	attachments;
	private boolean	finalMode;


	@Past
	public Date getDate() {
		return this.date;
	}
	public void setDate(final Date date) {
		this.date = date;
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

	public boolean isFinalMode() {
		return this.finalMode;
	}

	public void setFinalMode(final boolean finalMode) {
		this.finalMode = finalMode;
	}

}
