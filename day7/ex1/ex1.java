public class Spy{
	
	private static int spyCount = 0;
	
	private int spyID;
	
	public Spy(int spyID) {
		
		spyCount++;
		this.spyID = spyID;
		System.out.println(this.spyID);
		System.out.println("There are " + spyCount + "spies so far!");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}