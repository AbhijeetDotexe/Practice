import java.io.*;
import java.util.*;

public class LargestAltitude {
	public static void main(String[] args) {
		
		int[] gain = {-5,1,5,0,-7};
		System.out.println(largestAltitude(gain));
	}

	public static int largestAltitude(int[] gain) {
     
     	int max = 0;
     	// int n = gain.length+1;
     	int[] ans = new int[100];
     	ans[0] = 0;
     for (int i=1;i<=gain.length ;i++ ) {
        	ans[i] = gain[i-1]+ans[i-1];
        }   
        for(int i=0;i<ans.length;i++){
        	if(ans[i]>max){
        		max =ans[i];
        	}
        }
        return max;
    }
}
