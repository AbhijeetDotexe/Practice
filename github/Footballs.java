import java.io.*;
import java.util.*;

public class Footballs {
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

			int[] f = new int[n];
			String l = br.readLine();
			String[] str = l.trim().split("\\s+");
			for (int j=0;j<n ;j++ ) {
				f[j] = Integer.parseInt(str[j]);
			}
			int max = 0;
			int ans = 0;
			for (int k=0;k<n ;k++ ) {
				ans = arr[k]*20 - f[k]*10;
				if (ans>max) {
					max = ans;
				}
			}
			System.out.println(max);
		}
	}
}
