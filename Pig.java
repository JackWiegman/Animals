public class Pig {

	// Properties
	String name;
	int tagNumber;
	double weight;
	double mealValue;
	boolean eatenSinceLastExercise;

	// Constructor(s)
	public Pig(String name, int tagNumber, double weight) {
		this.name = name;
		this.tagNumber = tagNumber;
		this.weight = weight;
	}

	// Abilities
	public void eat(double poundsEaten) {
		mealValue = poundsEaten * 0.75;
		weight += mealValue;
		eatenSinceLastExercise = true;
		System.out.println(name + " ate " + poundsEaten + " pounds\nWeight is: " + weight);
		if (weight >= 1000) {
			System.out.println(name + " is eligible to win a Blue Ribbon");
		}
	}

	public void exercise(int timeExercised) {
		weight -= timeExercised / 3.0;
		if (eatenSinceLastExercise) {
			weight -= mealValue;
		}
		eatenSinceLastExercise = false;
		System.out.println(name + " exercised for " + timeExercised + " hours\nWeight is: " + weight);
		if (weight >= 1000) {
			System.out.println(name + " is eligible to win a Blue Ribbon");
		}
	}

	// Getter

	public String getName() {
		return this.name;
	}

	public int getTagNumber() {
		return this.tagNumber;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTagNumber(int tagNumber) {
		if (tagNumber < 0) return;

		this.tagNumber = tagNumber;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
