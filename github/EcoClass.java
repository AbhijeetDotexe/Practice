import java.io.*;
import java.util.*;

public class EcoClass {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] s = new int[n];
			int[] d = new int[n];
			int count = 0;
			for (int l=0;l<n ;l++ ) {
				s[l] = sc.nextInt();
			}
			for (int h=0;h<n ;h++ ) {
				d[h] = sc.nextInt();
			}
			for (int f=0;f<n;f++ ) {
				if (s[f] == d[f]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
