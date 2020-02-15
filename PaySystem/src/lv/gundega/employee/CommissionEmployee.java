package lv.gundega.employee;


public class CommissionEmployee extends Employee{ 
	
	
	private Double grossComission = 0.0;
	private static final Double BONUS_MULTIPLIER = 1.5;
	
	public CommissionEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name,bankAccount,grossWage);
		
	}


	@Override
	public Double grossPayment() {
		
		return grossWage + doCurrentComission()+doCurrentBonus();
	}

	
	private Double doCurrentComission() {
		Double commission = grossComission;
		//grossComission = 0.0;
		return commission;
	}

		//metode,kura pieskir komisiju
	public void giveCommission(Double amount){
		grossComission +=amount;
		
		//garaks pieraksts
		//grossComission =grossComission+amount;
	}


	@Override
	public void giveBonus(Double percentage) {
		currentBonus+=grossWage*(percentage/100)*BONUS_MULTIPLIER;
	}
	
	
}
