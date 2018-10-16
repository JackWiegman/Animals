public class DogTester {

	public static void main(String[] args) {
		Dog rover = new Dog("Rover", "Dalmation", 1);
		Dog dog2 = new Dog("Clifford", "BigRed", 2);

		System.out.println(rover.getName());
		System.out.println(dog2.getName());

		System.out.println(dog2.bark());
		dog2.sayHi();
	}

}