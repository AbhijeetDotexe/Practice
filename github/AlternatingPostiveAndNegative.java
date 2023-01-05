import java.io.*;
import java.util.*;

public class AlternatingPostiveAndNegative {
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
			int[] nums = {3,1,-2,-5,2,-4};
			int[] ans = rearrangeArray(nums);
			System.out.println(Arrays.toString(ans));
		}
	}

	public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[(n/2)];
        int[] brr = new int[(n/2)];
        int p=0,q=0;
        for (int i=0;i<n ;i++ ) {
        	if (nums[i]>0) {
        		arr[p] = nums[i];
        		p++;
        	}else {
        		brr[q] = nums[i];
        		q++;
        	}
        }
        int r=0,s=0;
        for (int j=0;j<n;j++ ) {
        	if (j%2==0) {
        		nums[j] = arr[r];
        		r++;
        	}else if(j%2!=0){
        		nums[j] = brr[s];
        		s++;
        	}
        }
        return nums;
    }
}
