import java.io.*;
import java.util.*;

public class MissingNumber {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long[] arr = new long[(int)n-1];
		String line = br.readLine();
		String[] strs = line.trim().split("\\s+");
		long sum = (long)(n*(n+1)/2);
		long sum1=0;
		for (int i=0;i<n-1 ;i++ ) {
			arr[i] = Long.parseLong(strs[i]);
			sum1+=arr[i];
		}
		System.out.println(sum-sum1);

	}
}
