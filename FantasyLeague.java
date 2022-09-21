import java.io.*;
import java.util.*;

public class FantasyLeague {
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
			int s = Integer.parseInt(st.nextToken());
			int finalAns = 100-s;
			int[] arr = new int[n];
			int[] brr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			String li = br.readLine();
			String[] str = li.trim().split("\\s+");
			for (int j=0;j<n;j++) {
				brr[j] = Integer.parseInt(str[j]);
			}
			boolean quit = false;
			for (int k=0;k<n ;k++ ) {
				if (brr[k]==0) {
					int temp = arr[k];
					for (int l=k+1;l<n ;l++ ) {
						if(brr[l]==0){
							continue;
						}else {
							if (temp+arr[l]<finalAns) {
								quit =true;
								System.out.println("yes");
								break;
							}
						}
					}
				}
			}
			while(!quit){
				System.out.println("no");
				quit = true;
			}
		}
	}
}
