
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class MiscellaneousRecord extends DomainEntity {

	private String	title;		//notBlank
	private String	attachment;
	private String	comments;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	public String getAttachment() {
		return this.attachment;
	}
	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}
	public String getComments() {
		return this.comments;
	}
	public void setComments(final String comments) {
		this.comments = comments;
	}

}
