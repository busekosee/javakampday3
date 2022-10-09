package Business.concretes;

import Business.abstracts.ICreditManager;
import Entities.concretes.Customer;

public class CustomerManager  {
    private Customer customer;
    private ICreditManager creditmanager;
    
	public CustomerManager(Customer customer, ICreditManager creditmanager) {
		super();
		this.customer = customer;
		this.creditmanager = creditmanager;
	}

	
	public void givecredit() {
		System.out.println("kredi verildi");
		creditmanager.calculate();
		creditmanager.save();
	}

}
