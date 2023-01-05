import java.io.*;
import java.util.*;

public class ThreeSum {
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
			int[] nums = {-1,0,1,2,-1,-4};
			List<List<Integer>> ans = threeSum(nums);
			System.out.println(ans);
		}
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length ;i++ ) {
        	if(i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }else{
        	int low=i+1;
        	int high=nums.length-1;
        	while(high>low){
        		int sum=nums[i]+nums[low]+nums[high];
        		if(sum>0) high--;
        		else if(sum<0) low++;
        		else{
        			ans.add(Arrays.asList(nums[low],nums[i],nums[high]));
        			high--;
        			low++;
        		}
        	}
        }
    }
        return new ArrayList<>(ans);
    }
}
