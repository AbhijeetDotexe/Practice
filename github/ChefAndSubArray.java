import java.io.*;
import java.util.*;

public class ChefAndSubArray {
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
			int sum=0, prod=1, count=0;
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}

			for (int j=0;j<n ;j++ ) {
				sum=0;
				prod=1;
				for (int k=j;k<n ;k++ ) {
					sum+=arr[k];
					prod*=arr[k];
					if (sum==prod) {
						count+=1;
					}
				}
			}
			System.out.println(count);
		}
	}
}
