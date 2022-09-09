import java.io.*;
import java.util.*;

public class SubtaskProblem {
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
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int sum=0,count=0;
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(strs[i]);
				sum+=arr[i];
			}

			if (sum == n) {
				System.out.println(100);
			}else {
				for (int j=0;j<m ;j++ ) {
					count+=arr[j];
				}
				if (count == m) {
					System.out.println(k);
				}else {
					System.out.println(0);
				}
			}
		}
	}
}
