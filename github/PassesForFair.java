import java.io.*;
import java.util.*;

public class PassesForFair{
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i=0;i<t ;i++ ) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (k>n) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}
}