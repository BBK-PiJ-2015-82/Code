import java.util.*;

public class Patient {
	
String name;
int age;

	public Patient(String name, int age) throws IllegalArgumentException {
		if (age < 0) {
			throw new IllegalArgumentException("age must not be negative");
		}
		if (age > 130) {
			throw new IllegalArgumentException("age must be less than 130");
		}

		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		NumberCounter numberCounter = new NumberCounter(3);
		numberCounter.getInts();
		numberCounter.returnResult();

	}

}