package model;

public class BusinessLookup {

	private String SIC_Code;
	private String businessName;
	
	public BusinessLookup() {
		super();
	}

	public BusinessLookup(String businessName, String sIC_Code) {
		super();
		this.businessName = businessName;
		SIC_Code = sIC_Code;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getSIC_Code() {
		return SIC_Code;
	}

	public void setSIC_Code(String sIC_Code) {
		SIC_Code = sIC_Code;
	}
	
}
