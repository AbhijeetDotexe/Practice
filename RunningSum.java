import java.io.*;
import java.util.*;

public class RunningSum {
	public static void main(String[] args) {
		
		int[] nums = {1,1,1,1,1};
		int[] res = runningSum(nums);
		System.out.println(Arrays.toString(res));
	}

	public static int[] runningSum(int[] nums){

		if (nums.length == 1) {
			
			return nums;
		}

		int[] result = new int[nums.length];
		for (int i=0;i<nums.length ;i++ ) {
		 	if (i==0) {
		 		result[i] = nums[i];
		 	}
		 	else {
		 		result[i] = nums[i]+result[i-1];
		 	}
		 }
		 return result; 
	}
}