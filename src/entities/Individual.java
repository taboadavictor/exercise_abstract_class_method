package entities;

public class Individual extends Person{
	
	private Double healthSpending;

	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public double tax() {
			
		double basicTax;
		if (getannualIncome() < 20000.0) {
			basicTax = getannualIncome() * 0.15;
		}
		else {
			basicTax = getannualIncome() * 0.25;
		}
		basicTax -= getHealthSpending() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
