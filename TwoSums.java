import java.io.*;
import java.util.*;

public class TwoSums {
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
			int[] nums = {2,7,11,15};
			int target = 9;
			int[] ans = twoSum(nums, target);
			System.out.println(Arrays.toString(ans));
		}
	}

	 public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length ;i++ ) {
        	for (int j=i+1;j<nums.length;j++ ) {
        		if (nums[i]+nums[j] == target) {
        			return new int[]{i,j};
        		}
        	}
        }
        return new int[]{};
    }
}
