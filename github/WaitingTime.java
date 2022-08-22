import java.io.*;
import java.util.*;

public class WaitingTime {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i=0; i<t ;i++ ) {
			
			int k = sc.nextInt();
			int x= sc.nextInt();

			int ans = k*7 - x;
			System.out.println(ans);
		}
	}
}
