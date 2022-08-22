import java.io.*;
import java.util.*;

public class Wordle {
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
			
			String s = sc.next();
			String c = sc.next();
			String m = "";
			int len = s.length();
			for (int k=0;k<len ;k++ ) {
				if (s.charAt(k)==c.charAt(k)) {
					m+="G";
				}else {
					m+="B";
				}
			}
			System.out.println(m);
		}
	}
}
