public class OldPhone implements Phone {
	
	private String brand = null;

	
	public void call(String number) {
		System.out.println("ring ring" + number);
	}


	public OldPhone(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
// ... there is no setter for brand

}