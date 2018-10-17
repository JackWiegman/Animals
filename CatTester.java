public class CatTester {

	public static void main(String[] args) {
		Cat rover = new Cat("Rover", 1);
		Cat clifford = new Cat("Clifford", 2);

		rover.pet();
		rover.eat();
		clifford.eat();
		rover.pet();
		clifford.eat();
		rover.scold();
		rover.scold();
		rover.scold();
		rover.scold();
		rover.eat();
	}

}