import java.io.*;
import java.util.*;

public class InteriorDesign{
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
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			int a = x1+y1;
			int b = x2+y2;
			
			if (b>a) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}
	}
}