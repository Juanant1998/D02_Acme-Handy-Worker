
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class ProfessionalRecord {

	private String	companyName;	// notBlank
	private Date	startDate;
	private Date	finishDate;
	private String	role;			//notBlank


	@NotBlank
	public String getNameOfCompany() {
		return this.companyName;
	}

	public void setNameOfCompany(final String companyName) {
		this.companyName = companyName;
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
	@NotBlank
	public String getRole() {
		return this.role;
	}

	public void setRole(final String role) {
		this.role = role;
	}

}
