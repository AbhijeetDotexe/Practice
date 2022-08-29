import java.io.*;
import java.util.*;

public class DominantElement {
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
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}

			Arrays.sort(arr);
			int[] c = new int[n];
			for (int j=0;j<n ;j++ ) {
				int count = 0;
				for (int k=j+1;k<n ;k++ ) {
					if (arr[j]==arr[k]) {
						count++;
					}
				}
				c[j] = count;
			}

			Arrays.sort(c);
			boolean ans = true;
			for (int l=0;l<n-1 ;l++ ) {
				if (c[n-1]<=c[l]) {
					ans = false;
				}
			}

			if (ans) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
