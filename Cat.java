public class Cat {

	// Properties
	String name;
	int tagNumber;
	int happiness = 50;
	int scoldCount = 0;

	// Constructor(s)
	public Cat(String name, int tagNumber) {
		this.name = name;
		this.tagNumber = tagNumber;
		this.happiness = happiness;
	}

	// Abilities

	public void pet() {
		happiness = negativeHappinessChange(50);
		System.out.println(name + " was pet\nHappiness: " + happiness + "%");
	}

	public void eat() {
		System.out.println(name + " ate");
		
		if (this.scoldCount >= 3) {
			happiness = positiveHappinessChange(25);
		} else {
			System.out.println(name + " hasn't been scolded at least 3 times since last meal");
		}
		
		this.scoldCount = 0;
	
		System.out.println("Happiness: " + happiness + "%");
	}

	public void scold() {
		System.out.println(name + " was scolded\nHappiness: " + happiness + "%");
		this.scoldCount += 1;
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

	public int getTagNumber() {
		return this.tagNumber;
	}

	public int getHappiness() {
		return this.happiness;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTagNumber(int tagNumber) {
		if (tagNumber < 0) return;

		this.tagNumber = tagNumber;
	}

	public void setHappiness(int happiness) {
		this.happiness = 50;
	}

}