import java.io.*;
import java.util.*;

public class VersionControlSystem {
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
			int count1=0, count2=0;
			int[] arr = new int[n];
			String line = br.readLine();
			String l = br.readLine();
			String[] strs = line.trim().split("\\s+");
			String[] str = l.trim().split("\\s+");
			for (int i=0;i<m;i++) {
				int temp = Integer.parseInt(strs[i]);
				arr[temp-1]++;
			}
			for (int j=0;j<k;j++) {
				int tem = Integer.parseInt(str[j]);
				arr[tem-1]++;
			}
			for(int e: arr){
				if (e == 2) {
					count1++;
				}else if (e==0){
					count2++;
				}
			}
			System.out.println(count1+" "+count2);
		}
	}
}
