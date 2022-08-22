import java.io.*;
import java.util.*;

public class CupFinals {
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
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int a = Math.abs(x-y);
			if (z<a) {
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}
