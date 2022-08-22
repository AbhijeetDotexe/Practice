import java.io.*;
import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i =0;i<t ;i++ ) {
			int n = sc.nextInt();
			int r = 0;
			while(n>0){
				r = r*10+n%10;
				n = n/10;
			}
			System.out.println(r);
		}
	}
}
