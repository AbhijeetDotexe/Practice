import java.io.*;
import java.util.*;

public class ReverseAnArray {
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
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
			// System.out.println(Arrays.toString(arr));
			 for(int k=n-1;k>=0;k--){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
		}
	}
}
