package barbershop;

import java.util.Arrays;

public class Barber extends Peeps {

	
	private int chairNumber;
	private String[] licenses;
	private double servicePrice;
	private String tools;
	private String specialty;
	
	
	public Barber() {
		
	}



	public Barber(String arms, String legs, int age, double height, double weight, String firstName, String lastName,
			String profession, boolean hairCutting, int chairNumber, String[] licenses, double servicePrice,
			String tools, String specialty) {
		super(arms, legs, age, height, weight, firstName, lastName, profession, hairCutting);
		this.chairNumber = chairNumber;
		this.licenses = licenses;
		this.servicePrice = servicePrice;
		this.tools = tools;
		this.specialty = specialty;
	}



	public Barber(int chairNumber, String[] licenses, double servicePrice, String tools, String specialty) {
		super();
		this.chairNumber = chairNumber;
		this.licenses = licenses;
		this.servicePrice = servicePrice;
		this.tools = tools;
		this.specialty = specialty;
	}



	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String elephant) {
		specialty = elephant;
	}


	public int getChairNumber() {
		return chairNumber;
	}


	public void setChairNumber(int chairNumber) {
		this.chairNumber = chairNumber;
	}


	public String[] getLicenses() {
		return licenses;
	}


	public void setLicenses(String[] licenses) {
		this.licenses = licenses;
	}


	public double getServicePrice() {
		return servicePrice;
	}


	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}


	public String getTools() {
		return tools;
	}


	public void setTools(String tools) {
		this.tools = tools;
	}


	public static void setGreeting(int age, String firstName) {
		if (age <= 25) {
			System.out.println("Wassup");
		} else if (age <= 35 && age >= 26) {
			System.out.println("Howdy");
		} else if (age <= 65 && age >= 36) {
			System.out.println("Hey " + firstName);
		} else {
			System.out.println("I'm retiring soon, whaddya want!?");
		}
	}



	@Override
	public String toString() {
		return "Barber Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() + "\nLicensed: " + Arrays.toString(licenses)
		+ "\nCost: " + servicePrice;
	}


	
	

}
