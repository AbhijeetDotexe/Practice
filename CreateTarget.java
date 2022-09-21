import java.io.*;
import java.util.*;

public class CreateTarget {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	public static int[] createTargetArray(int[] nums, int[] index) {
        
    	ArrayList<Integer> arraylist = new ArrayList<>();
    	for (int i=0;i<nums.length ;i++ ) {
    		arraylist.add(index[i],nums[i]);
    	}
    	int[] ans = new int[nums.length];
    	for(int i=0;i<ans.length;i++){
    		ans[i] = arraylist.get(i);
    	}
    	return ans;
    }
}