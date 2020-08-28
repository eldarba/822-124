package app.core.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompanyAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String city;
	private String country;
	@OneToOne(mappedBy = "address", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private Company company;

	public Company getCompany() {
		return company;
	}

	public CompanyAddress() {
	}

	public CompanyAddress(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CompanyAddress [id=" + id + ", city=" + city + ", country=" + country + "]";
	}

}
