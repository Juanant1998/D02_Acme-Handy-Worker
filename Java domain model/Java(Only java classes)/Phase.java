
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Phase extends DomainEntity {

	private String	title;			//notBlank
	private String	description;	//notBlank
	private Date	startMoment;
	private Date	endMoment;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
	public Date getStartMoment() {
		return this.startMoment;
	}
	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}
	public Date getEndMoment() {
		return this.endMoment;
	}
	public void setEndMoment(final Date endMoment) {
		this.endMoment = endMoment;
	}

}
