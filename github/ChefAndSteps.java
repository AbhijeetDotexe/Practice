import java.io.*;
import java.util.*;

public class ChefAndSteps {
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
			int k  = Integer.parseInt(st.nextToken());
			int n =  Integer.parseInt(st.nextToken());
			int[] arr = new int[k];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<k ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			StringBuilder s = new StringBuilder();
			for (int j=0;j<k ;j++ ) {
				if (arr[j]%n==0) {
					s.append("1");
				}else {
					s.append("0");
				}
			}
			System.out.println(s.toString());
		}
	}
}
