import java.io.*;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

	 public static int removeDuplicates(int[] nums) {
        
        int ans = 0;
        int pointer = 0;
        int pointer2 = 0;
        int i=0;
        while(i<nums.length){
        	for(int j=i;j<nums.length;j++){
        		if (nums[i] == nums[j]) {
        			pointer++;
        		}else {
        			break;
        		}
        	}
        	nums[pointer2] = nums[i];
        	i=pointer;
        	pointer2++;
        	ans++;
        }
        return ans;
    }
}