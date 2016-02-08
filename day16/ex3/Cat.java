import java.util.*;
import java.io.*;

public class Cat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		System.out.println(userInput.length());

		int startOfWord = 0;
		ArrayList<File> fileArray = new ArrayList<File>();

		System.out.println(userInput.length());


		for (int i = 0; i < userInput.length() ; i++ ) {
		
			if (userInput.charAt(i) == ' ') {
				System.out.println(userInput.charAt(i));
				fileArray.add(new File(userInput.substring(startOfWord, (i))));
				startOfWord = i + 1;

			}
		}

		System.out.println(fileArray.isEmpty());

	//	File[] file = new File(sc.next());
		for ( File file : fileArray ) {
							System.out.println(file.toString());


			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();
				while (line != null) {
//			System.out.println(line);

					sb.append(line);
					sb.append(System.lineSeparator());
					sb.append(System.lineSeparator());

					line = br.readLine();
				//i++;
				}


				System.out.println(sb.toString());
			} catch (FileNotFoundException fnfe) {
				System.out.println("Not A FILE");

			} catch (IOException ioe) {
				System.out.println("ioe exception");
			} 
		}
		

//	System.out.println(file.listFiles().toString());
//	System.out.println(file.isDirectory());


	}
}


