public class Spy{
	
	private static int spyCount = 0;
	
	private int spyID;
	
	public Spy(int spyID) {
		
		spyCount++;
		this.spyID = spyID;
		System.out.println(this.spyID);
		System.out.println("There are " + spyCount + " spies so far!");
		
	}
	
	public void die(Spy aSpy) {
		spyCount--;
		System.out.println("Spy " + aSpy.spyID + " has been detected and eliminated");
		System.out.println("There are " + spyCount + " spies so far!");
	}
}