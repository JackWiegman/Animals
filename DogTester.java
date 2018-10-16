public class DogTester {

	public static void main(String[] args) {
		Dog rover = new Dog("Rover", "Dalmation", 1);
		Dog clifford = new Dog("Clifford", "BigRed", 2);

		rover.pet();
		rover.eat();
		clifford.eat();
		rover.pet();
		clifford.eat();
		rover.scold();
	}

}