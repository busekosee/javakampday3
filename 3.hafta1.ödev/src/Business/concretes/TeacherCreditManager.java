package Business.concretes;

import Business.abstracts.ICreditManager;

public class TeacherCreditManager implements ICreditManager{
 public  void calculate() {
	  System.out.println("öğretmen kredisi hesaplandı");
  }

@Override
public void save() {
	
}
}
