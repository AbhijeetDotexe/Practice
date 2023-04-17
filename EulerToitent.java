import java.io.*;
import java.util.*;

public class EulerToitent {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int ans = 1;
		for (int i=1;i<=t ;i++ ) {
			ans = euler(i);
			System.out.println(ans);
		}
		// System.out.println(ans);
	}

	public static int euler(int n){
		int count = n;
		for (int i=2;i*i<=n ;i++ ) {
			if (n%i==0) {
				count = count-count/i;
				while(n%i==0){
					n=n/i;
				}
			}
		}
		if (n>1) {
			count = count-count/n;
		}
		return count;
	}
}
