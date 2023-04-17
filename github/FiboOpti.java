import java.io.*;
import java.util.*;

public class FiboOpti {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		long n = (long)a;
		long ans = fibo(n);
		System.out.println(ans);

	}

	public static long fibo(long n){
		if (n<=1) {
			return n;
		}
		long x=0,y=1,ans=0;
		for (int i=2;i<=n ;i++ ) {
			ans = x+y;
			x=y;
			y=ans;
		}
		return ans;
	}
}
