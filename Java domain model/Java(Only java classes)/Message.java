
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Message extends DomainEntity {

	private String	subject;	//notBlank
	private String	body;
	private String	priority;	//notBlank
	private String	tags;		//notBlank
	private Date	moment;	//past
	private String	sender;	// notBlank
	private String	recipient;	//notBlank


	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}
	@NotBlank
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(final String priority) {
		this.priority = priority;
	}
	@NotBlank
	public String getTags() {
		return this.tags;
	}

	public void setTags(final String tags) {
		this.tags = tags;
	}
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getSender() {
		return this.sender;
	}

	public void setSender(final String sender) {
		this.sender = sender;
	}
	@NotBlank
	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(final String recipient) {
		this.recipient = recipient;
	}

}
