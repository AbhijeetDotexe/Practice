import java.io.*;
import java.util.*;

public class FruitChaat {
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
			if ((x/2)<y) {
				System.out.println(x/2);
			}else {
				System.out.println(y);
			}
		}
	}
}
