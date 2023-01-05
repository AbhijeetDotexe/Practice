import java.io.*;
import java.util.*;

public class SpiralMatrix {
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
			int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			List<Integer> ans = new ArrayList<>();
			ans = spiralOrder(matrix);
			System.out.println(ans);
		}
	}
	 public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int m=matrix.length, n= matrix[0].length;
        int left=0, right=n-1;
        int top=0, bottom=m-1;
        while(m*n>ans.size()){
        	for (int i=left;i<=right ;i++ ) {
        		ans.add(matrix[top][i]);
        	}

        	for (int j=top+1;j<=bottom ;j++ ) {
        		ans.add(matrix[j][right]);
        	}

        	if (top!=bottom) {
        		
        		for (int i=right-1;i>=left ;i-- ) {
        		ans.add(matrix[bottom][i]);
        		}
        	}

        	if (left!=right) {
        		for (int j=bottom-1;j>top ;j-- ) {
        			ans.add(matrix[j][left]);
        		}
        	}
        	top++;
        	bottom--;
        	left++;
        	right--;
        }
        return ans;
    }
}
