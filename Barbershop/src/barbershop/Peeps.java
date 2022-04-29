package barbershop;

public class Peeps {
	private String arms;
	private String legs;
	private int age;
	private double height;
	private double weight;
	private String firstName;
	private String lastName;
	private String profession;
	private boolean hairCutting;

	public Peeps() {

	}

	public Peeps(String arms, String legs, int age, double height, double weight, String firstName, String lastName,
			String profession, boolean hairCutting) {
		this.arms = arms;
		this.legs = legs;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.hairCutting = hairCutting;
	}

	public String getArms() {
		return arms;
	}

	public void setArms(String arms) {
		this.arms = arms;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 0;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0.0) {
			this.weight = weight;
		} else {
			this.weight = 0;
		}
	}

	public String getFirstName() {
		if (firstName != null || firstName.isBlank()) {
			return firstName;
		} else {
		return firstName = "No Input";
		}
	}

	public void setFirstName(String firstName) {
		if (firstName != null) {
			this.firstName = firstName;
		} else {
			this.firstName = "No Input";
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName != null) {
			this.lastName = lastName;
		} else {
			this.lastName = "No Input";
		}
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public boolean isHairCutting() {
		return hairCutting;
	}

	public void setHairCutting(boolean hairCutting) {
		this.hairCutting = hairCutting;
	}

	public void assignProfession(String profession) {
		if (profession.equals("Barber")) {
			hairCutting = true;
			this.profession = profession;
		} else {
			hairCutting = false;
		}
	}

	@Override
	public String toString() {
		return "Peeps [arms=" + arms + ", legs=" + legs + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", profession=" + profession
				+ ", hairCutting=" + hairCutting + "]";
	}

}
