
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Warranty extends DomainEntity {

	private String	title;			//notBlank
	private String	terms;			//notBlank
	private String	applicableLaws;	//notBlank


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getTerms() {
		return this.terms;
	}

	public void setTerms(final String terms) {
		this.terms = terms;
	}
	@NotBlank
	public String getApplicableLaws() {
		return this.applicableLaws;
	}

	public void setApplicableLaws(final String applicableLaws) {
		this.applicableLaws = applicableLaws;
	}

}
