import java.io.*;
import java.util.*;

public class BuyAndSellStocks {
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
			int[] prices = {7,1,5,3,6,4};
			int ans = maxProfit(prices);
			System.out.println(ans);
		}
	}

	public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxP=0;
        for (int i=0;i<prices.length ;i++ ) {
        	minPrice = Math.min(prices[i], minPrice);
        	maxP = Math.max(maxP,prices[i]-minPrice);
        }
        return maxP;
    }
}
