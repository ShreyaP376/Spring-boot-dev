import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new java.io.FileReader("sample.txt"))){
			String line;
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			System.out.println("File not found");;
		}
	}
}
