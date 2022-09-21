import java.io.*;
import java.util.*;
// [1,2,3,4,5,6,7]
// [7,1,2,3,4,5,6]
// [5, 6, 7, 1, 2, 3, 4]

public class RotateArray {
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
			int[] nums = {1,2,3,4,5,6,7};
			rotate(nums,3);
			System.out.println(Arrays.toString(nums));
		}
	}
	 public static void rotate(int[] arr, int k) {
	 	int n = arr.length;
	     if (n == 0) return;
    	k = k % n;
    	if (k > n) return;
    	int[] temp = new int[k];
	    for (int i = n - k; i < n; i++) {
	      temp[i - n + k] = arr[i];
	    }
	    for (int i = n - k - 1; i >= 0; i--) {
	      arr[i + k] = arr[i];
	    }
	    for (int i = 0; i < k; i++) {
	      arr[i] = temp[i];
	    }
	}
}
