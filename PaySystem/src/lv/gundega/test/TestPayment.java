package lv.gundega.test;

import lv.gundega.employee.CommissionEmployee;
import lv.gundega.employee.SalaryEmployee;
import lv.gundega.paysystem.PaymentSystem;

public class TestPayment {

	
	public static void main(String[] args) {
		
		PaymentSystem paymentSystem =new PaymentSystem();
		CommissionEmployee toms = new CommissionEmployee("Toms Ozolins", 1010101, 5000.0);
		paymentSystem.addPayee(toms);
		CommissionEmployee ieva = new CommissionEmployee("Ieva Berzina", 2020202, 5000.8);	
		paymentSystem.addPayee(ieva);
		
		SalaryEmployee janis = new SalaryEmployee ("Janis Kalnins",3030303, 3000.0);
		paymentSystem.addPayee(janis);
		SalaryEmployee zanda = new SalaryEmployee ("Zanda Berza",4040404, 5374.4);
		paymentSystem.addPayee(zanda);
		
		//simulate work
		toms.giveCommission(4.0);
		toms.giveCommission(50.0);
		
		janis.giveBonus(10.0);
		ieva.giveBonus(17.0);
		
		ieva.giveCommission(40.6);
		//ieva.giveCommission(30.0);
		ieva.giveCommission(60.0);
		toms.giveCommission(43.5);
		
		paymentSystem.processPayments();
		
		//System.out.println(paymentSystem.payees);
		paymentSystem.printNames();
	}

}
