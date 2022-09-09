import java.io.*;
import java.util.*;

public class PermutationClear {
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
			String line = br.readLine();
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			int k = Integer.parseInt(br.readLine());
			int[] brr = new int[k];
			String li = br.readLine();
			String[] str = li.trim().split("\\s+");
			int y=0;
			HashSet<Integer> set = new HashSet<>();
			for (int j=0;j<k;j++ ) {
				brr[j] = Integer.parseInt(str[j]);
				set.add(brr[j]);
			}
			int[] ans = new int[n-k];
			for (int l=0;l<n ;l++ ) {
				if (set.contains(arr[l])) {
					continue;
				}else{
					ans[y] = arr[l];
					System.out.print(ans[y]+" ");
					y+=1;
				}
			}
			System.out.println();
		}
	}
}
