import Business.concretes.CustomerManager;
import Business.concretes.MilitaryCreditManager;
import Entities.concretes.Customer;
import Entities.concretes.Personal;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1);
		customer.getSurname();
		customer.getSurname();
		customer.getId();
		Personal personal=new Personal("buse", "köse", 1, 2);
		personal.getName();
		personal.getNationalityid();
		personal.getSurname();
		personal.getId();
		
		CustomerManager customermanager=new CustomerManager(new Personal("buse","köse",1,2),new MilitaryCreditManager());
	    System.out.println("-------");
		customermanager.givecredit();
		
	}}