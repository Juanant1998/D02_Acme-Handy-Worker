
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	private String	title;		//notBlank
	private String	lastUpdate;
	private String	summary;	//notBlank
	private String	picture;	//url
	private String	section;


	@URL
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(final String picture) {
		this.picture = picture;
	}

	public String getSection() {
		return this.section;
	}

	public void setSection(final String section) {
		this.section = section;
	}

	public String getTitle() {
		return this.title;
	}
	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
	}
	public String getLastUpdate() {
		return this.lastUpdate;
	}
	public void setLastUpdate(final String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getSummary() {
		return this.summary;
	}
	@NotBlank
	public void setSummary(final String summary) {
		this.summary = summary;
	}

}
