import java.io.*;
import java.util.*;

public class RacingHorses {
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
			int min = Integer.MAX_VALUE;
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			int diff=0;
			Arrays.sort(arr);
			for (int j=0;j<n-1;j++) {
				diff = arr[j+1]-arr[j];
				if (diff<min) {
					min = diff;
				}
			}
			System.out.println(min);
		}
	}
}
