import java.io.*;
import java.util.*;

public class Concatenation {
	public static void main(String[] args) {
		
		int[] nums = {1,2,1};
		int[] nums2 = {1,3,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums2)));
	}

	 public static int[] getConcatenation(int[] nums) {
     	
     	int n = nums.length;
     	int[] ans = new int[2*n];

     	for (int i=0;i<nums.length;i++ ) {
     		ans[i] = nums[i];
     		ans[i+n] = nums[i];
     	}

     	return ans;
    }
}