import java.io.*;
import java.util.*;

public class MinimumJumps {
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
			// StringTokenizer st = new StringTokenizer(br.readLine());
			// int n = Integer.parseInt(st.nextToken());
			int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
			int ans = minJumps(arr);
			System.out.println(ans);

		}
	}

	 static int minJumps(int[] arr){
        int n = arr.length;
        int j=0;
        int sum=0;
        int count=0;
        for (int i=0;i<n;i++ ) {
        	sum+=arr[j];
        	j = sum;
        	count++;
        	// System.out.println(count);
        	if (sum>n) {
        		break;
        	}
        }
        // System.out.println(count);
       return count;
    }
}
