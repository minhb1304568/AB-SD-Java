package model;

public class AddressLookup {

	private String address;
	private String postCode;
	private String town;
	private String county;
	private String country;
	
	public AddressLookup() {
		super();
	}

	public AddressLookup(String address, String postCode) {
		super();
		this.address = address;
		this.postCode = postCode;
	}

	public AddressLookup(String address, String postCode, String town, String county, String country) {
		super();
		this.address = address;
		this.postCode = postCode;
		this.town = town;
		this.county = county;
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
