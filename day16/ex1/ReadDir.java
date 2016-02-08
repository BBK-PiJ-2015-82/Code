import java.util.*;
import java.io.*;

public class ReadDir {

	public static void main(String[] args) {
//	String pathname = "I:/Code/Code/day16";
	String pathname = ".";

	File file = new File(pathname);
	//file = file.list();

	String[] files = file.list();
	for (int i = 0; i<files.length ;i++ ) {
		System.out.println(files[i].toString());
	}
//	System.out.println(file.listFiles().toString());
//	System.out.println(file.isDirectory());


}
}