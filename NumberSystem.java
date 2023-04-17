import java.io.*;
import java.util.*;

public class NumberSystem {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int ans = getValueInBase(n, d);
		System.out.println(ans);
	}

	public static int getValueInBase(int n, int d){
		int rv = 0;
		int p = 1;
		while(n>0){
			int dig = n%d;
			n=n/d;

			rv+=dig*p;
			p*=10;
		}
		return rv;
	}
}
