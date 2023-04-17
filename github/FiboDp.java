import java.io.*;
import java.util.*;

public class FiboDp {
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
		long ans = Fibo(n);
		System.out.println(ans);
	}

	public static long Fibo(long n){
		long[] arr = new long[(int)n+1];
		arr[0]=arr[1]=1;
		for (int i=2;i<=n ;i++ ) {
			arr[i] = arr[i-1]+arr[i-2];
		}

		return arr[(int)n];
	}
}
