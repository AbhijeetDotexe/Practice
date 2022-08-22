import java.io.*;
import java.util.*;

public class FillCandies {
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
			int m = sc.nextInt();
			int ans ;
			int p = k*m;
			if (n%p == 0) {
				ans = n/p;
				System.out.println(ans);
			}else {
				ans = (n/p) +1;
				System.out.println(ans);
			}

		}
	}
}
