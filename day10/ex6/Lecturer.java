public class Lecturer extends Teacher {

	public Lecturer(String name) {
		super(name);
		
	}


	public void doResearch(String topic) { 
		System.out.println("Doing research on: " + topic);
	} 

	public void launch() {
		System.out.println(getName());
		teach("something");
	}


public static void main(String[] args) {
	Lecturer lecturer = new Lecturer("John");
	lecturer.launch();
}

}