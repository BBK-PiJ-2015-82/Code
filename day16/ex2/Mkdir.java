import java.util.*;
import java.io.*;

public class Mkdir {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);


	File file = new File(sc.next());
	file.mkdir();

	
//	System.out.println(file.listFiles().toString());
//	System.out.println(file.isDirectory());


}
}