import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Reader {

	public static void main(String [] ergs) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		try (FileWriter fw = new FileWriter("lines.txt")){
			try (BufferedWriter bwr = new BufferedWriter(fw))
			{
				for (int i=1; i<=4; i++) 
				{
					System.out.println("Enter the line:");
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("lines are written");
			
		
	}
}
