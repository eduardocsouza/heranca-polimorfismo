package entites;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
	}
	
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
	@Override
	public Double tax() {
		if(numberOfEmployees > 10 ) {
			return getAnualIncome() * 0.14; 
		}else {
			return getAnualIncome() * 0.1;
		}
		
	}
	
	@Override
	public String text() {
		super.text();
		return getName() + ":" + " $ " + String.format("%.2f", tax());
	}
	
	

}
