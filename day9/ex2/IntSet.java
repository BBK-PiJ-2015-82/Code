public interface IntSet {

	// adds a new int to the set; if it is there already, nothing happens.

	void add(int n) ; 

	boolean contains(int n) ; 

	boolean containsVerbose(int n) ;

	String toString();

}