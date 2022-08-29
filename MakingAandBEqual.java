import java.io.*;
import java.util.*;

public class MakingAandBEqual {
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
			long ans = 0, count = 0;
			int[] brr = new int[n];
			String l = br.readLine();
			String[] str = l.trim().split("\\s+");
			for (int j=0;j<n ;j++ ) {
				brr[j] = Integer.parseInt(str[j]);
				if (arr[j]-brr[j]>0) {
					ans +=(arr[j]-brr[j]);
				}
				count+=(arr[j]-brr[j]);
			}
			if (count == 0) {
				System.out.println(ans);
			}else {
				System.out.println(-1);
			}

		}
	}
}
