import java.util.*;


public class Hospital {

	List<Patient> patients;


	public Hospital() {
		patients = new ArrayList<Patient>();
	}

	public void addPatient() {
		System.out.println("Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc = new Scanner(System.in);
				System.out.println("Age: ");

		int age = sc.nextInt();
		patients.add(new Patient(name, age));
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.addPatient();
				hospital.addPatient();
		hospital.addPatient();
		hospital.addPatient();
		hospital.addPatient();
		hospital.addPatient();
		hospital.addPatient();
		hospital.addPatient();
		hospital.addPatient();



	}
	
}