public class Mammal extends Animal {
	
	public Mammal(String str) {
		super(str);
	}

	public void reproduce() {
		giveBirth();
	}

	private void giveBirth() {

		System.out.println("given birth");

	}

	public void call() {

	}
}