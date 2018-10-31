
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Endoserment extends DomainEntity {

	private Date	moment;	//past
	private String	comment;	//notBlank


	public enum badWords {
		NOT, BAD, HORRIBLE, AVERAGE, DISASTER
	};

	public enum goodWords {
		GOOD, FANTASTIC, EXCELLENT, GREAT, AMAZING, TERRIFIC, BEAUTIFUL
	};


	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

}
