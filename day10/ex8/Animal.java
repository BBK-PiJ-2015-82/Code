public abstract class Animal {
	
	String name;

	public Animal(String str) {
		this.name = str;
	}

	abstract void reproduce();

	public void call() {
		System.out.println(this.name + " coming...");
	}

	public void makeSounds() {};
}