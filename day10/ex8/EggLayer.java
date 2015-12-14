public class EggLayer extends Animal {
	
	public EggLayer(String str) {
		super(str);
	}

	public void reproduce() {
		layEggs();
	}

	private void layEggs() {

		System.out.println("egg laid, plop");

	}
}