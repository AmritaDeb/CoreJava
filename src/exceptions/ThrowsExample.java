package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	
	public static void fileReader() throws IOException {
		FileReader file = new FileReader("test.txt");
		file.close();
	}
	
	public static void main(String[] args) {
		try {
			fileReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
