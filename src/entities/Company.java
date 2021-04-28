package entities;

public class Company extends Person{
	
	private Integer employees;

	public Company(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}
	
	@Override
	public double tax() {
		if (employees > 10) {
			return getannualIncome() * 0.14;
		}
		else {
			return getannualIncome() * 0.16;
		}
	}

}
