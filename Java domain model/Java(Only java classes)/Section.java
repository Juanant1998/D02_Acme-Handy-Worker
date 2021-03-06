
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Section extends DomainEntity {

	private String	title;		// notBlank
	private String	text;		//notBlank
	private String	comment;	//notBlank


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getText() {
		return this.text;
	}
	public void setText(final String text) {
		this.text = text;
	}
	@NotBlank
	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

}
