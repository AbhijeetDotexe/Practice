import java.io.*;
import java.util.*;

public class InsideTheStadium {
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
			int count=0;
			float strikeRate=0, sum=0;
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
				sum+=arr[i];
				strikeRate = (sum/(i+1));
				// System.out.println(sum+" "+(i+1));
				if ((strikeRate*100)==100) {
					// System.out.println(sum+" "+(i+1) +" "+(sum/(i+1)));
					count++;
				}else {
					continue;
				}
			}
			System.out.println(count);
		}
	}
}
