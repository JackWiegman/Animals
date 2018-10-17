public class Dog {

	// Properties
	String name;
	String breed;
	int tagNumber;
	int happiness = 50;
	boolean petted = false;

	// Constructor(s)
	public Dog(String name, String breed, int tagNumber) {
		this.name = name;
		this.breed = breed;
		this.tagNumber = tagNumber;
		this.happiness = happiness;
		this.petted = petted;
	}

	// Abilities
	public String bark() {
		return ("Bark");
	}

	public void sayHi() {
		System.out.println(bark() + ", My name is " + this.name);
	}

	public void pet() {
		happiness = positiveHappinessChange(10);
		this.petted = true;
		System.out.println(name + " was pet\nHappiness: " + happiness + "%");
	}

	public void eat() {
		System.out.println(name + " ate");
		
		if (happiness < 25) {
			System.out.println(name + " isn't happy enough to eat");
		} else {
			if (this.petted) {
				happiness = positiveHappinessChange(25);
			} else {
				System.out.println(name + " hasn't been pet since last meal");
			}
			
			this.petted = false;
		}
		System.out.println("Happiness: " + happiness + "%");
	}

	public void scold() {
		happiness = negativeHappinessChange(20);
		System.out.println(name + " was scolded\nHappiness: " + happiness + "%");
	}

	public int positiveHappinessChange(int positiveHappinessChange) {
		if (happiness >= (100 - positiveHappinessChange)) {
			happiness = 100;
		} else {
			happiness += positiveHappinessChange;
		}

		return happiness;
	}

	public int negativeHappinessChange(int negativeHappinessChange) {
		if (happiness - negativeHappinessChange <= 0) {
			happiness = 0;
		} else {
			happiness -= negativeHappinessChange;
		}

		return happiness;
	}


	// Getter

	public String getName() {
		return this.name;
	}

	public String getBreed() {
		return this.breed;
	}

	public int getTagNumber() {
		return this.tagNumber;
	}

	public int getHappiness() {
		return this.happiness;
	}

	public boolean getPetted() {
		return this.petted;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}	

	public void setTagNumber(int tagNumber) {
		if (tagNumber < 0) return;

		this.tagNumber = tagNumber;
	}

	public void setHappiness(int happiness) {
		this.happiness = 50;
	}

	public void setPetted(boolean petted) {
		this.petted = false;
	}

}

