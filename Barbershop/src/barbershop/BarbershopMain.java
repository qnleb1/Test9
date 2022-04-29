package barbershop;

public class BarbershopMain {

	public static void main(String[] args) {
		String[] blcerts = { "fpr", "straight razor", "color/perm" };

		Barber b1 = new Barber("two arms", "two legs", 23, 72, 200, "Terrence", "Scarl", "Barber", true, 6, blcerts,
				19.99, "Norelco", "beards");

		Barber b2 = new Barber();
		b2.assignProfession("Barber");
		b2.setAge(30);
		b2.setFirstName("Jimmy");
		b2.setLastName("Buffett");
		b2.setChairNumber(3);
		b2.setServicePrice(23.99);
		String[] b2certs = { "fpr", "paul mitchell", "mani/pedi" };
		b2.setLicenses(b2certs);

		Customer c1 = new Customer();
		c1.setFirstName(" ");
		c1.setLastName(null);
		System.out.println(c1.getFirstName() + " " + c1.getLastName());
		menu();
	}

	public static void menu() {
		System.out.println("*******WELCOME TO BARBERSHOP******");
		System.out.println("Enter 1 to schedule an appointment");
		System.out.println("Enter 2 for list of barbers currently working");
		System.out.println("Enter 3 for barber specializations");
		System.out.println("Enter 4 to pay for haircut/check in");
		System.out.println("Enter 5 to exit");
	}

}
