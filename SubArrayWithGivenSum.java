import java.io.*;
import java.util.*;

public class SubArrayWithGivenSum {
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
			int[] arr = {1, 9,5,6,4, 3, 7};
    		int n = arr.length, k = 10;
		    System.out.println("Subarray with given sum is: ");
		    GivenSum(arr,n,k);
		}
	}

	public static void GivenSum(int[] arr, int n, int k){
		int start=0, end = -1, sum=0;
		while(start<n){
			while((end+1<n) && (sum+arr[end+1]<=k)){
				sum+=arr[++end];
				// System.out.println(sum);
				if (sum == k) {
					for (int p=start;p<=end ;p++ ) {
						System.out.print(arr[p]+" ");
					}
					System.out.println();
				}
			}
			System.out.println("Sum before subtraction : "+sum);
			sum -= arr[start];
			System.out.println("Sum after subtraction : "+sum);
			// System.out.println("arr of start : "+arr[start]);
			start++;
		}
	}
}
