import java.io.*;
import java.util.*;

public class AiAnalysing {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		if (t<=1000) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
