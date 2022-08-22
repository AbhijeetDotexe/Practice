import java.io.*;
import java.util.*;

public class Winnerr {
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
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();

			int a = Math.max(p,q);
			int b = Math.max(r,s);

			if (a>b) {
				System.out.println("Q");
			}else if (b>a) {
				System.out.println("P");
			}else {
				System.out.println("TIE");
			}
		}
	}
}
