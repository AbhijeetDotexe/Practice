import java.io.*;
import java.util.*;

public class MajorityElementTwo {
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
			int[] nums = {3,2,3};
			List<Integer> ans = new ArrayList<>();
			ans = majorityElement(nums);
			System.out.println(ans);
		}
	}

	public static List<Integer> majorityElement(int[] nums) {
        int num1=Integer.MIN_VALUE, num2=Integer.MIN_VALUE, count1=0, count2=0, len=nums.length;
        for(int i=0;i<len;i++){
        	if (nums[i]==num1) {
        		count1++;
        	}else if (nums[i]==num2) {
        		count2++;
        	}else if(count1==0){
        		num1=nums[i];
        		count1=1;
        	}else if(count2==0){
        		num2=nums[i];
        		count2=1;
        	}else {
        		count1--;
        		count2--;
        	}
        }

        List<Integer> ans = new ArrayList<Integer>();
        count1=0;
        count2=0;
        for (int i=0;i<len;i++) {
        	if (nums[i]==num1) {
        		count1++;
        	}else if (nums[i]==num2) {
        		count2++;
        	}
        }
        if (count1>len/3) {
        	ans.add(num1);
        }
        if (count2>len/3) {
        	ans.add(num2);
        }
        return ans;
    }
}
