import java.io.*;
import java.util.*;

public class ChefApps {
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
			int s = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int a = s-(x+y);
			if (a>=z) {
				System.out.println(0);
			}else if (z<=x+a || z<=y+a) {
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		}
	}
}
