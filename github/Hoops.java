import java.io.*;
import java.util.*;

public class Hoops {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i=0;i<t ;i++ ) {
			int n = Integer.parseInt(br.readLine());
			int ans = (n+1)/2;
			System.out.println(ans);
		}
	}
}
