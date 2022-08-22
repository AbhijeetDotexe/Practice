import java.io.*;
import java.util.*;

public class HardestProblemBet {
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

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();


			if (a<b && a<c) {
				System.out.println("Draw");
			}else if (b<a && b<c) {
				System.out.println("Bob");
			}else {
				System.out.println("Alice");
			}
		}
	}
}
