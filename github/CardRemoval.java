import java.io.*;
import java.util.*;

public class CardRemoval {
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
			int max=Integer.MIN_VALUE;
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			Arrays.sort(arr);
			for (int j=0;j<n ;j++ ) {
				int count=0;
				for (int k=j;k<n ;k++ ) {
					if (arr[j]==arr[k]) {
						count++;
					}
				}
				if (count>max) {
					max=count;
				}
			}
			System.out.println(n-max);
		}
	}
}
