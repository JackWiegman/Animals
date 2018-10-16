public class Dog {

	// Properties
	String name;
	String breed;
	int tagNumber;
	int happiness
	

	// Constructor(s)
	public Dog(String name, String breed, int tagNumber, int happiness) {
		this.name = name;
		this.breed = breed;
		this.tagNumber = tagNumber;
		this.happiness = happiness
	}

	// Abilities
	public String bark() {
		return ("Bark");
	}

	public void sayHi() {
		System.out.println(bark() + ", My name is " + name);
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

}