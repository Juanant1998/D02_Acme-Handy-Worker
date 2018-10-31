
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EducationRecord extends DomainEntity {

	private String	titleOfDiploma;	//NotBlank
	private Date	startDate;
	private Date	finishDate;
	private String	attachment;	//url
	private String	comments;


	@NotBlank
	public String getTitleOfDiploma() {
		return this.titleOfDiploma;
	}

	public void setTitleOfDiploma(final String titleOfDiploma) {
		this.titleOfDiploma = titleOfDiploma;
	}
	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return this.finishDate;
	}
	public void setFinishDate(final Date finishDate) {
		this.finishDate = finishDate;
	}
	@URL
	public String getAttachmentLink() {
		return this.attachment;
	}

	public void setAttachmentLink(final String attachment) {
		this.attachment = attachment;
	}
	public String getComments() {
		return this.comments;
	}
	public void setComments(final String comments) {
		this.comments = comments;
	}

}
