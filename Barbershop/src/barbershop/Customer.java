package barbershop;

public class Customer extends Peeps {
	
	private double cashOnHand;
	private double hairLength;
	
	public Customer() {
		
	}


	
	public Customer(double cashOnHand, double hairLength) {
		super();
		this.cashOnHand = cashOnHand;
		this.hairLength = hairLength;
	}



	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public double getHairLength() {
		return hairLength;
	}

	public void setHairLength(double hairLength) {
		this.hairLength = hairLength;
	}

	public static double setPriceHairLength(double hairLength, double price) {
		if(hairLength > 5) {
			price = price * 1.1;
			return price;
		}
		return price;
	}

	@Override
	public String toString() {
		return "Customer [cashOnHand=" + cashOnHand + ", hairLength=" + hairLength + "]";
	}
	
	
}
