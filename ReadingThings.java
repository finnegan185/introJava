package discussions;

import java.io.FileReader;
import java.io.IOException;

public class ReadingThings {
	public static void main(String[] args) throws IOException{
		FileReader input = null;
		
		try {
			input = new FileReader("Crime.csv");
			int i;
			
			while((i = input.read()) != null) {
				if (i == 0) {
					System.out.print(Character.toString((char) i) + " ");
				}
				System.out.print(i + " ");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
