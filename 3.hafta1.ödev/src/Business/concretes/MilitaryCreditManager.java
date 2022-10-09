package Business.concretes;

import Business.abstracts.ICreditManager;

public class MilitaryCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı");
		
	}

	@Override
	public void save() {
		
		
	}
	

}
