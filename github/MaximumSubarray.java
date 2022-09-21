import java.io.*;
import java.util.*;

public class MaximumSubarray {
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
			int ans = (n*(n+1))/2;
			if (ans%2==0) {
				System.out.println(n);
			}else {
				System.out.println(n-1);
			}
		}
	}
}
