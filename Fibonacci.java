import java.io.*;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int ans = fib(n);
			System.out.println(ans);
		}
	}

	 public static int fib(int n) {
        if (n < 2) {
        	return 1;
        }

        return fib(n-1)+fib(n-2);
    }
}
