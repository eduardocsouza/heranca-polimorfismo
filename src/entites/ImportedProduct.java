package entites;

public final class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + 
					" $ "
					+ String.format("%.2f", totalPrice())
					+ " (Customs fee: $ "
					+ String.format("%.2f", customsFee) 
					+ ")";
	}

}