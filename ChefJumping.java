import java.io.*;
import java.util.*;

public class ChefJumping {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
			if (n%6==0 || n%6==1 || n%6==3) {
				System.out.println("yes");				
			}else {
				System.out.println("no");
			}
}
}