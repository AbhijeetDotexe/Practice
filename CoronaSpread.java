import java.io.*;
import java.util.*;

public class CoronaSpread {
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
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int count = 1;
			int[] arr = new int[n+1];

			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			arr[n] = arr[n-1] + 3;
			for (int j=0;j<n;j++ ) {
				if (arr[j+1]-arr[j]<=2) {
					count+=1;
				}else {
					if(max<count) max = count;
					if(min>count) min = count;
					count = 1;
				}
			}

			if (count!=1) {
				if(count>max) max = count;
				if(count<min) min = count;
			}
			System.out.println(min+" "+max);
		}
	}
}
