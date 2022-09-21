import java.io.*;
import java.util.*;

public class SimpleStats {
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
			int k = Integer.parseInt(st.nextToken());
			double average=0, total=0;
			int y=0;
			double[] arr = new double[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++) {
				arr[i] = Double.parseDouble(strs[i]);
			}
			Arrays.sort(arr);
			double[] brr = new double[n-2*k];
			for (int j=k;j<n-k;j++) {
				brr[y] = arr[j];
				total+=brr[y];
				y++;
			}
			average = total/(long)brr.length;
			System.out.printf("%.6f\n", average);
		}
	}
}
