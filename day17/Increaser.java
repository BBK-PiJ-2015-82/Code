public class Increaser implements Runnable {
	private Counter c;
	private int id;
	public Increaser(Counter counter, int id) {
		this.c = counter;
		this.id = id;
	}
	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter, i);
			Thread t = new Thread(increaserTask);
			t.start();
			//System.out.println("loop " + i);
		}
	}
	public void run() {
			System.out.println("Starting at " + c.getCount());
			for (int i = 0; i < 10000; i++) {
				c.increase();

			}
			System.out.println(id + " Stopping at " + c.getCount());
			//System.out.println("loop " + i);

		
	}


}
