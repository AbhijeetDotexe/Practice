import java.io.*;
import java.util.*;

public class SearchIn2DArray {
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
			int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
			boolean ans = searchMatrix(matrix,3);
			System.out.println(ans);
		}
	}
	 public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
        	return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end  = (n*m)-1;

        while(start<=end){
        	int mid  = start+(end-start)/2;
        	if (matrix[mid/m][mid%m] == target) {
        		return true;
        	}else if(matrix[mid/m][mid%m]<target){
        		start = mid+1;
        	}else if(matrix[mid/m][mid%m]>target){
        		end = mid-1;
        	}
        }
        return false;
    }
}
