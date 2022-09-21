import java.io.*;
import java.util.*;

public class MajorityElements {
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
			int[] nums = {2,2,1,1,1,2,2};
			int ans = majorityElement(nums);
			System.out.println(ans);
		}
	}

	public static int majorityElement(int[] nums) {
        if (nums.length<=1) {
        	return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int target = (int)Math.ceil((double)nums.length/2); 
        for(int i:nums){
        	if (map.containsKey(i)) {
        		if (map.get(i)+1>=target) {
        			return i;
        		}else {
        			map.put(i,map.get(i)+1);
        		}
        	}else {
        		map.put(i,1);
        	}
        }
        return -1;
    }
}
