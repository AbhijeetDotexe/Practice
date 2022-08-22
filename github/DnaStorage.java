import java.io.*;
import java.util.*;

public class DnaStorage {
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
			int n = sc.nextInt();
			String code = sc.next();
			String decode = "";

			for (int k=0;k<n ;k+=2 ) {
				if (code.charAt(k)=='0' && code.charAt(k+1) == '0') {
					decode+="A";
				}else if (code.charAt(k)=='0' && code.charAt(k+1) == '1') {
					decode+="T";
				}else if (code.charAt(k)=='1' && code.charAt(k+1) == '0') {
					decode+="C";
				}else if (code.charAt(k)=='1' && code.charAt(k+1) == '1') {
					decode+="G";
				}
			}
			System.out.println(decode);
		}

	}
}
