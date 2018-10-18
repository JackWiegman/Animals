public class Mouse {

	// Properties
	String name;
	int safeness = 50;
	int runawaySpeed = 5;

	// Constructor(s)
	public Mouse(String name) {
		this.name = name;
	}

	// Abilities
	public void meetCat(Cat cat) {
		if (safeness >= 20) {
			safeness -= 20;
		} else {
			safeness = 0;
		}
		System.out.pirntln("Mouse met Dog at " + Dog.happiness + "% happiness");
		System.out.println("Mouse feels " + safeness + "% safe");
		System.out.println("Speed is: " + runawaySpeed(happiness));
	}


	public void meetDog(Dog dog) {
		if (dog.happiness() >= 50) {
			if (safeness <= 90) {
				safeness += 10;
			} else {
				safeness = 100;
			}
		} else {
			if (safeness >= 10) {
				safeness -= 10;
			} else {
				safeness = 0;
			}
		}
		System.out.pirntln("Mouse met Dog at " + Dog.happiness + "% happiness");
		System.out.println("Mouse feels " + safeness + "% safe");
		System.out.println("Speed is: " + runawaySpeed(happiness));
	}

	public int runawaySpeed(int happiness) {
		runawaySpeed = happiness / 10;
		return runawaySpeed;
	}

	// Getter

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
