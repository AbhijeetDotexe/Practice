import java.io.*;
import java.util.*;

public class HouseRobber2 {
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
			int[] nums = {1,2,3,1};
			int ans = rob(nums);
			System.out.println(ans);
		}
	}
	 public static int rob(int[] nums) {
        if (nums.length<2) {
        	return nums[0];
        }
        int[] skipLastHouse = new int[nums.length-1];
        int[] skipFirstHouse = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
        	skipLastHouse[i]=nums[i];
        	skipFirstHouse[i]=nums[i+1];
        }

        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);
        return Math.max(lootSkippingFirst,lootSkippingLast);

    }

    private static int robHelper(int[] nums){
    	if (nums.length<2) {
    		return nums[0];
    	}

    	int[] dp = new int[nums.length];
    	dp[0] = nums[0];
    	dp[1] = Math.max(nums[0],nums[1]);

    	for (int i=2;i<nums.length ;i++ ) {
    		dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
    	}

    	return dp[nums.length-1];
    }
}
