public class Salmon extends AquaticAnimal {
	
	

	public Salmon(String str) {
		super(str);
	}

	public static void main(String[] args) {
	

		Salmon salmon = new Salmon("Salmon");
		salmon.call();
		salmon.reproduce();
	}


}