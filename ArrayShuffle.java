import java.io.*;
import java.util.*;

public class ArrayShuffle {
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int m = 3;
		int[] ans = shuffle(nums, m);
		System.out.println(Arrays.toString(ans));
	}

	 public static int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[2*n];

        for(int i=0, j=n, k=0;i<ans.length && k<ans.length;i++,j++){
        	ans[k++] = nums[i];
        	ans[k++] = nums[j];
        }
        return ans;
    }
}