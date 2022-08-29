import java.io.*;
import java.util.*;

public class BrokenTelephone {
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
			HashSet<Integer> set = new HashSet<>();
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}

			for(int j=0;j<n-1;j++){
				if (arr[j]!=arr[j+1]) {
					set.add(j);
					set.add(j+1);
				}
			}
			System.out.println(set.size());
			set.clear();
		}
	}
}
