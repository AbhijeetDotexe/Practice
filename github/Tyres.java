import java.io.*;
import java.util.*;

public class Tyres {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i =0;i<t ;i++ ) {
			int n = sc.nextInt();
			if (n%4 == 0) {
				System.out.println("NO");
			}else if (n%4!=0 && n%2==0) {
				System.out.println("YES");
			}
		}
	}
}
