import java.io.*;
import java.util.*;

public class PriceControl {
	public static void main(String[] args) throws IOException {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();

		for (int i=0;i<t ;i++ ) {
			try{
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] p = new int[n];
			int old=0, newR=0;
			for (int h =0;h<n ;h++ ) {
				p[h] = sc.nextInt();
				old+=p[h];
			}
			for (int m=0;m<n ;m++ ) {
				if (p[m]>k) {
					p[m] = k;
				}
				newR +=p[m];
			}
			System.out.println(old-newR);
		}catch(NumberFormatException nfex){}
	}
	}
}
