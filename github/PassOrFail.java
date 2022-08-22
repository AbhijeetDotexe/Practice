import java.io.*;
import java.util.*;

public class PassOrFail {
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
			int x = sc.nextInt();
			int p = sc.nextInt();
			int q = n-x;
			int r = x*3 - q*1;
			if (r>=p) {
				System.out.println("PASS");	
			}else {
				System.out.println("FAIL");
			}		
		}
	}
}
