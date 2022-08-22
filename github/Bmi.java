import java.io.*;
import java.util.*;

public class Bmi {
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
			int m = sc.nextInt();
			int h = sc.nextInt();
			int o = h*h;
			int p = m/o;
			if (p<=18) {
				System.out.println(1);
			}else if (p>18 && p<25) {
				System.out.println(2);
			}else if (p>=25 && p<30) {
				System.out.println(3);
			}else {
				System.out.println(4);
			}
		}
	}
}
