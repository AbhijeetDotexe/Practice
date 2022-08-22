import java.io.*;
import java.util.*;

public class MinCoins {
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
			int x = sc.nextInt();
			int count;

			if (x%10 == 0) {
				count = x/10;
				System.out.println(count);
			}else if (x%5 == 0 && x>10) {
				count = x/10 + 1;
				System.out.println(count);
			}else if(x%5 == 0) {
				count = 1;
				System.out.println(count);
			}else {
				System.out.println(-1);
			}
		}
	}
}
