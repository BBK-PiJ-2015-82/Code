public class Company {
	
	private GenericList names;
	private GenericList niNumbers;

	public Company() {
		names = new GenericList();
		niNumbers = new GenericList();
	}

	public void launcher() {
		names.add("John");
		names.add("Paul");

		names.add("Steve");

		names.add("Peter");

		names.add("Luke");

		names.add("Simon");
		niNumbers.add("sdfg");
		niNumbers.add(24234);

		niNumbers.add("3453sdfsd45");

		niNumbers.add("345345");

		niNumbers.add("Si3453mon");

		niNumbers.add("34345");

		Rubbish newNode = new Rubbish("tetr");
		niNumbers.add(newNode);


		System.out.println(names.get());
		System.out.println(niNumbers.get());

	}

	public static void main(String[] args) {
		Company company = new Company();
		company.launcher();


	}
}