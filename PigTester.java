public class PigTester {

	public static void main(String[] args) {
		Pig pig1 = new Pig("Oinkers", 1, 500);

		pig1.eat(20);
		pig1.eat(40);
		pig1.eat(60);
		pig1.exercise(2);
		pig1.exercise(5);
		pig1.eat(30);
		pig1.exercise(3);
		pig1.eat(500);
		pig1.eat(150);
	}

}