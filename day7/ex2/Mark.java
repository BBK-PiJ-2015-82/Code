public class Mark {
	
	private int total = 0;
	private int distinction = 0;
	private int pass = 0;
	private int fail = 0;
	private int invalid = 0;

	public void init() {
		int x = 0;
		this.total = x;
		this.distinction = x;
		this.pass = x;
		this.fail = x;
		this.invalid = x;
		
	}
	public static void main (String[] args) {
		Mark mark = new Mark();
		mark.init();
		
		do {
			String userInput = System.console().readLine();
			if (Integer.parseInt(userInput) > 60) {
				this.distinction++;
			}
			
			//finished here - TBC...
			
			
		} while (userInput != "quit");
	}	
	
}