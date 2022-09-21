import java.io.*;
import java.util.*;

public class EvenNumbers {
	public static void main(String[] args) {
		int[]  nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}

	public static int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i=0; i<nums.length;i++){
        	int temp = nums[i];
        	int digits = 0;
        	while(temp>0){
        		temp/=10;
        		digits++;
        	}
        	if (digits%2 == 0) {
        		count+=1;
        	}

        }
        return count;
    }
}