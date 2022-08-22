import java.io.*;
import java.util.*;
// import java.util.Math;

public class Bidding {
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
			
			int Alice = sc.nextInt();
			int Bob = sc.nextInt();
			int Charlie = sc.nextInt();

			// System.out.println(Math.max(Alice, Bob, Charlie));
			if (Alice>Bob && Alice>Charlie) {
				System.out.println("Alice");
			}else if (Bob>Alice && Bob>Charlie) {
				System.out.println("Bob");
			}else {
				System.out.println("Charlie");
			}
		}
	}
}
