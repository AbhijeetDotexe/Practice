import java.io.*;
import java.util.*;

public class ChefAndGlove {
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
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<arr.length;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			int[] glove = new int[n];
			String li = br.readLine();
			String[] s = li.trim().split("\\s+");
			int count1 = 0;
			for (int k=0;k<n ;k++ ) {
				glove[k] = Integer.parseInt(s[k]);
				if (arr[k]<=glove[k]) {
					count1++;
				}
			}

			int count2 = 0;
			for (int l=0;l<n ;l++ ) {
				if (arr[l]<=glove[n-1-l]) {
					count2++;
				}
			}

			if (count1 == n && count2<n) {
				System.out.println("front");
			}else if (count2 == n && count1<n) {
				System.out.println("back");
			}else if (count1==n && count2==n) {
				System.out.println("both");
			}else {
				System.out.println("none");
			}

		}
	}
}
