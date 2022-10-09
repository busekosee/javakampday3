package Entities.concretes;

import Entities.abstracts.IEntity;

public class Customer implements IEntity{
	
	int id1;
	
	public Customer(int id1) {
		super();
		this.id1 = id1;
	}
	public int getId() {
		return id1;
	}
	public void setId(int id) {
		this.id1 = id;
	}
	public void getSurname() {
		// TODO Auto-generated method stub
		
	}
	

}
