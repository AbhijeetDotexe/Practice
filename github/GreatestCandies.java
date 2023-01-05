import java.io.*;
import java.util.*;

public class GreatestCandies {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> result = kidsWithCandies(candies, extraCandies);
		System.out.println(Arrays.toString(result.toArray()));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    

    	int max = 0;
    	List<Boolean> res = new ArrayList();

    	for(int x: candies){
    		max = Math.max(max,x);
    	}    

    	for(int x:candies){
    		res.add(x+extraCandies>=max);
    	}
    	return res;
    }
}