package Entities.concretes;

import Entities.abstracts.IEntity;

public class Company extends Customer implements IEntity{

	

	public Company(int id1, String companyname, int companyidnumber) {
		super(id1);
		this.companyname = companyname;
		this.companyidnumber = companyidnumber;
	}
	String companyname;
	int companyidnumber;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getCompanyidnumber() {
		return companyidnumber;
	}
	public void setCompanyidnumber(int companyidnumber) {
		this.companyidnumber = companyidnumber;
	}
	

	

}
