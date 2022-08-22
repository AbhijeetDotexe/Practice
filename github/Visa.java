import java.io.*;
import java.util.*;

public class Visa {
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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int f = sc.nextInt();
			int g = sc.nextInt();
			int h = sc.nextInt();

			if ((b>=a) && (f>=c) && (h<=g) ) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
