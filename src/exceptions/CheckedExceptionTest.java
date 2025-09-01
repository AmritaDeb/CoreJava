package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {
	
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("test.txt");		// FileNotFoundException
			file.close();		// IOException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
