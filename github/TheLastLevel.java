import java.io.*;
import java.util.*;

public class TheLastLevel {
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
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if (x<=3) {
				System.out.println(x*y);
			}else {
				int k = x/3;

				if (x%3 == 0) {
					System.out.println(x*y + (k-1)*z);
				}else {
					System.out.println(x*y+k*z);
				}
			}
		}
	}
}
