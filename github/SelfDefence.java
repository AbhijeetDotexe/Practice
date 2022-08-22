import java.io.*;
import java.util.*;

public class SelfDefence {
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
			int[] arr = new int[n];
			for (int j=0;j<n;j++ ) {
				arr[j] = sc.nextInt();
			}
			int count = 0;

			for (int k=0;k<n;k++ ) {
				if (arr[k]>=10 && arr[k]<=60) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
