import java.io.*;
import java.util.*;

public class BuyLamp {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i=0;i<t;i++ ) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int p = k*x +(n-k)*y;
			int q = n*x;

			System.out.println(Math.min(p,q));
		}
	}
}
