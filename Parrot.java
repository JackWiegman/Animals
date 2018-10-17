public class Parrot {

	// Properties
	String name;
	int tagNumber;
	int talkCounter = 0;
	String lastWordSaid;
	int wordCounter = 1;

	// Constructor(s)
	public Parrot(String name, int tagNumber) {
		this.name = name;
		this.tagNumber = tagNumber;
	}

	// Abilities
	public void talk(String lastWordHeard) {
		talkCounter += 1;
		if (lastWordHeard.equals(lastWordSaid)) {
			wordCounter += 1;
		}

		if (wordCounter >= 3) {
			if (talkCounter >= 3) {
				System.out.println(lastWordHeard + " squawk squawk");
				talkCounter = 0;
			} else {
				System.out.println(lastWordHeard + " squawk squawk");
			}
		} else {
			if (talkCounter >= 3) {
				System.out.println(lastWordHeard + " squawk");
				talkCounter = 0;
			} else {
				System.out.println(lastWordHeard);
			}
		}
		
		lastWordSaid = lastWordHeard;
	}

	// Getter

	public String getName() {
		return this.name;
	}

	public int getTagNumber() {
		return this.tagNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTagNumber(int tagNumber) {
		if (tagNumber < 0) return;

		this.tagNumber = tagNumber;
	}
}
