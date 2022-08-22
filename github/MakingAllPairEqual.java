import java.io.*;
import java.util.*;

public class MakingAllPairEqual {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i=0;i<t;i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			int count = 0;

			for (int k=0;k<n ;k++ ) {
				StringTokenizer a = new StringTokenizer(br.readLine());
				arr[k] = Integer.parseInt(a.nextToken());
			}
			
			for (int l=0;l<n ;l++ ) {
				int count1 = 0;
				for (int m=l;m<n ;m++ ) {
					if (arr[l] == arr[m]) {
						count1++;
					}
				
				count = Math.max(count1,count);
				}
			}
			System.out.println(n - count);
		}
			
	}
}
