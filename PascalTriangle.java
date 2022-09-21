import java.io.*;
import java.util.*;

public class PascalTriangle {
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
			int numRows = 5;
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			ans = generate(numRows);
			System.out.println(ans);
		}
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row, pre=null;
        for (int i=0;i<numRows;++i ) {
        	row = new ArrayList<Integer>();
        	for (int j=0;j<=i;++j ) {
        		if (j==0 || j==i) {
        			row.add(1);
        		}else{
        			row.add(pre.get(j-1)+pre.get(j));
        		}
        	}
        	pre=row;
        	ans.add(row);
        }
        return ans;
    }
}
