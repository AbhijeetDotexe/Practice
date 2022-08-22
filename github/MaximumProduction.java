import java.io.*;
import java.util.*;

public class MaximumProduction {
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
			
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int r = 7-d;
			int a = 7*x;
			int b = d*y+z*r;
			System.out.println(Math.max(a,b));
		}
	}
}
