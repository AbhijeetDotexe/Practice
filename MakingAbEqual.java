import java.io.*;
import java.util.*;

public class MakingAbEqual {
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
			int[] brr = new int[n];
			int[] max = new int[n];
			long s1=0,s2=0;
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			String l = br.readLine();
			String[] str = l.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
				brr[i] = Integer.parseInt(str[i]);
				max[i] = Math.max(arr[i],brr[i]);
				s1+=max[i]-arr[i];
				s2+=max[i]-brr[i];
			}
			if(s1==s2){
				System.out.println(s1);
			}else {
				System.out.println(-1);
			}
		}
	}
}
