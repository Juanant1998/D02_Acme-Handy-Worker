
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Note extends DomainEntity {

	private Date	moment;			//past
	private String	creatorComment;	//notBlank
	private String	comment;		//notBlank


	@Past
	public Date getMoment() {
		return this.moment;
	}
	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getCreatorComment() {
		return this.creatorComment;
	}

	public void setCreatorComment(final String creatorComment) {
		this.creatorComment = creatorComment;
	}
	@NotBlank
	public String getComments() {
		return this.comment;
	}

	public void setComments(final String comment) {
		this.comment = comment;
	}

}
