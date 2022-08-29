import java.io.*;
import java.util.*;

public class VaccineDistribution {
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
			double d = Double.parseDouble(st.nextToken());
			double a=0, b=0, day1=0, day2=0;
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
				if (arr[i]>=80 || arr[i]<=9) {
					a++;
				}else {
					b++;
				}
			}
			day1 = Math.ceil(a/d);
			day2 = Math.ceil(b/d);
			int day = (int)(day1+day2);
			System.out.println(day);
		}
	}
}
