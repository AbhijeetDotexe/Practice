import java.io.*;
import java.util.*;

public class LaptopRecommendation {
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

			int[] count = new int[11];
			int[] ans = new int[11];
			for (int j=0;j<10 ;j++ ) {
				count[j] = 0;
				ans[j] = 0;
			}
			
			for (int k=0;k<n;k++ ) {
				count[arr[k]]+=1;
				ans[arr[k]]+=1;
			}

			Arrays.sort(count);
			int max = count[10];

			int ca = 0;
			int index = 0;
			for (int v=0;v<=10 ;v++ ) {
				if (max == ans[v]) {
					ca+=1;
					index=v;
				}
			}
			if (ca == 1) {
				System.out.println(index);
			}else {
				System.out.println("CONFUSED");
			}
		}
	}
}
