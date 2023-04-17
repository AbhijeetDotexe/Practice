import java.io.*;
import java.util.*;

public class CountSubArrays {
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
			int[] nums = {1,3,5,2,7,5};
			int minK=1;
			int maxK=5;
			long ans = countSubarrays(nums,minK,maxK);
			System.out.println(ans);
		}
	}

	public static long countSubarrays(int[] nums, int minK, int maxK) {
        
        long res=0, bad=-1, min=-1, max=-1, n=nums.length;
        for (int i=0;i<n ;i++ ) {
        	
        
        if (nums[i]<minK || nums[i]>maxK) {
        	bad=i;
        }else if(nums[i]==minK){
        	min=i;
        }else if (nums[i]==maxK) {
        	max=i;
        }

        res+=Math.max(0L,Math.min(min,max)-bad);
    }
    return res;
}
}






