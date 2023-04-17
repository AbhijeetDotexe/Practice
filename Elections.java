import java.io.*;
import java.util.*;

public class Elections {
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
			int count = 0;
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int n = Integer.parseInt(strs[0]);
			int x = Integer.parseInt(strs[1]);
			int[] arr = new int[n];
			String linet = br.readLine();
			String[] s = linet.trim().split("\\s+");
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(s[i]);
				if(arr[i]>=x){
					count++;
				}
			}
			System.out.println(count);
		}

	}
}
