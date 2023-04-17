import java.io.*;
import java.util.*;

public class RunningComparison {
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
			int count=0;
			String line = br.readLine();
			String[] ar = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(ar[i]);
			}

			String li = br.readLine();
			String[] b = li.trim().split("\\s+");
			for (int j=0;j<n ;j++ ) {
				brr[j] = Integer.parseInt(b[j]);
			}

			for (int k=0;k<n ;k++ ) {
				if(arr[k]>=brr[k]/2 && brr[k]>=arr[k]/2){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
