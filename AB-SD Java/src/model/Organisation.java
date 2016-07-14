package model;

public class Organisation {
	
	private String orgName;
	private String shortDescr;
	private AddressLookup addressLookup; // (Address Line, PostCode, City, County, Country)
	private BusinessLookup businessLookup; // (Business Name, SIC code)
	private String phoneNumber;
	private String leadContact; // Con sua!
	private boolean preferredOrganisation;
	private boolean expressOfInterest;
	private String fullDescr;
	private String fax;
	private String email;
	private String webAddr;
	private int charityNumber;
	private int companyNumber;
	
	public Organisation() {
		super();
	}

	public Organisation(String orgName, String shortDescr, AddressLookup addressLookup, BusinessLookup businessLookup,
			String phoneNumber) {
		super();
		this.orgName = orgName;
		this.shortDescr = shortDescr;
		this.addressLookup = addressLookup;
		this.businessLookup = businessLookup;
		this.phoneNumber = phoneNumber;
	}

	public Organisation(String orgName, String shortDescr, AddressLookup addressLookup, BusinessLookup businessLookup,
			String phoneNumber, String leadContact, boolean preferredOrganisation, boolean expressOfInterest,
			String fullDescr, String fax, String email, String webAddr, int charityNumber, int companyNumber) {
		super();
		this.orgName = orgName;
		this.shortDescr = shortDescr;
		this.addressLookup = addressLookup;
		this.businessLookup = businessLookup;
		this.phoneNumber = phoneNumber;
		this.leadContact = leadContact;
		this.preferredOrganisation = preferredOrganisation;
		this.expressOfInterest = expressOfInterest;
		this.fullDescr = fullDescr;
		this.fax = fax;
		this.email = email;
		this.webAddr = webAddr;
		this.charityNumber = charityNumber;
		this.companyNumber = companyNumber;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getShortDescr() {
		return shortDescr;
	}

	public void setShortDescr(String shortDescr) {
		this.shortDescr = shortDescr;
	}

	public AddressLookup getAddressLookup() {
		return addressLookup;
	}

	public void setAddressLookup(AddressLookup addressLookup) {
		this.addressLookup = addressLookup;
	}

	public BusinessLookup getBusinessLookup() {
		return businessLookup;
	}

	public void setBusinessLookup(BusinessLookup businessLookup) {
		this.businessLookup = businessLookup;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLeadContact() {
		return leadContact;
	}

	public void setLeadContact(String leadContact) {
		this.leadContact = leadContact;
	}

	public boolean isPreferredOrganisation() {
		return preferredOrganisation;
	}

	public void setPreferredOrganisation(boolean preferredOrganisation) {
		this.preferredOrganisation = preferredOrganisation;
	}

	public boolean isExpressOfInterest() {
		return expressOfInterest;
	}

	public void setExpressOfInterest(boolean expressOfInterest) {
		this.expressOfInterest = expressOfInterest;
	}

	public String getFullDescr() {
		return fullDescr;
	}

	public void setFullDescr(String fullDescr) {
		this.fullDescr = fullDescr;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebAddr() {
		return webAddr;
	}

	public void setWebAddr(String webAddr) {
		this.webAddr = webAddr;
	}

	public int getCharityNumber() {
		return charityNumber;
	}

	public void setCharityNumber(int charityNumber) {
		this.charityNumber = charityNumber;
	}

	public int getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(int companyNumber) {
		this.companyNumber = companyNumber;
	}
	
}
