import java.io.*;
import java.util.*;

public class HouseRobber {
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
			int[] nums = {2,7,9,3,1};
			int[] num = {2,3,2};
			int ans = rob(num);
			System.out.println(ans);
		}
	}

	public static int rob(int[] nums) {
        int[] arr = Arrays.copyOfRange(nums,0,nums.length);
        if(nums.length<=3){
        	if (nums.length==3) {
        		return nums[0]+nums[2];
        	}else if (nums.length==2) {
        		return Math.max(nums[0],nums[1]);
        	}else if(nums.length==1){
        		return nums[0];	
        	}else {
        		return -1;
        	}
        }else{
        Arrays.sort(arr);
        int c=0,sum=0;
        int a = arr[arr.length-1];
        for (int i=0;i<nums.length ;i++ ) {
        	if (nums[i]==a) {
        		c = i;
        	}
        }
        if(c%2==0){
        	for (int i=0;i<nums.length ;i+=2 ) {
        		sum+=nums[i];
        	}
        }else{
        		for (int j=1;j<nums.length ;j+=2 ) {
        			sum+=nums[j];
        		}
        }
        return sum;
    }
}
}
