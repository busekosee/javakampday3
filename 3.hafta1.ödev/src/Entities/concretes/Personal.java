package Entities.concretes;

import Entities.abstracts.IEntity;

public class Personal extends Customer implements IEntity {
	String name;
	String surname;
	public Personal(String name, String surname, int id, int nationalityid) {
		super(id);
		this.nationalityid = nationalityid;
	}
	int nationalityid=2;
	
   
	public int getNationalityid() {
		return nationalityid;
	}
	public void setNationalityid(int nationalityid) {
		this.nationalityid = nationalityid;
	}
	public void getSurname() {
		// TODO Auto-generated method stub
		
	}
	public void getName() {
		// TODO Auto-generated method stub
		
	}
}
