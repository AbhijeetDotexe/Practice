import java.io.*;
import java.util.*;

public class CountFrequency {
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
			int n=4, p=3;
			int[] arr = {2, 3, 2, 3, 5};
			int[] brr = {3,3,3,3};
			frequencyCount(brr,n,p); 
		}
	}

	public static void frequencyCount(int arr[], int n, int P)
    {

      int[] brr = new int[n];
      for (int j=0;j<n ;j++ ) {
      	brr[j] = 0;
      }
      for (int i=0;i<n ;i++ ) {
      	brr[arr[i]-1]+=1;
      }
      // System.out.println(Arrays.toString(brr));
      for (int k=0;k<n ;k++ ) {
      	System.out.print(brr[k]+" ");
      }
      System.out.println();
    }
}
