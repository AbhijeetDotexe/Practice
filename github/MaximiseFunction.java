import java.io.*;
import java.util.*;

public class MaximiseFunction {
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
			long[] arr = new long[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++) {
				arr[i] = Long.parseLong(strs[i]);
			}
			Arrays.sort(arr);
			long ans=2*(arr[n-1]-arr[0]);
			System.out.println(ans);			
		}
	}
}
