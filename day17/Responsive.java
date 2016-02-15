import java.util.Scanner;

public class Responsive implements Runnable {
	
	//private int duration;
	private int id;
	private boolean finished;
	private static String completedTasks;

	public Responsive(int id) {
		
		this.id = id;
	}

	public void run() {
		try {
			//this.sleep(duration);
			completedTasks.concat("" + this.id);
			System.out.println("Try");
		} catch (InterruptedException ie) {
			System.out.println("catch ie");

		} catch (IllegalMonitorStateException imse) {
			System.out.println("catch imse");

		}
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		while (counter.getCount() <= 9) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the duration (in ms) of task " + counter.getCount() + ": ");
			int duration = sc.nextInt();
			Responsive responsive = new Responsive(counter.getCount());
			Thread thread = new Thread(responsive);
			throws InterruptedException {
				thread.sleep(duration);
			}
			if (completedTasks != "") {
				System.out.println("Finished tasks: " + completedTasks);
			}
			counter.increase();
		}

	}
}