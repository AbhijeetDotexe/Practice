import java.io.*;
import java.util.*;

public class Mixture {
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
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a>0 &&  b>0) {
				System.out.println("Solution");
			}else if (a>0 && b==0) {
				System.out.println("Solid");
			}else {
				System.out.println("Liquid");
			}
		}
	}
}
