import java.io.*;
import java.util.*;

public class MaxSubArraySum {
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
			int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
			int ans = maxSubArray(nums);
			System.out.println(ans);
		}
	}

	public static int maxSubArray(int[] nums) {
        int sum=0, max=nums[0];
        for (int i=0;i<nums.length;i++) {
        	sum+=nums[i];
        	if(sum>max) max=sum;
        	if(sum<0) sum=0;
        }
        return max;
    }
}
