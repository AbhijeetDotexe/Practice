import java.io.*;
import java.util.*;

public class Transpose {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] result = transpose(matrix);
		for (int i=0;i<result.length ;i++ ) {
			for(int j=0;j<result[0].length;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

	 public static int[][] transpose(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] res = new int[n][m];

        for (int i=0;i<m ;i++ ) {
        	for(int j=0;j<n;j++){
        		res[j][i] = matrix[i][j];
        	}
        }
        return res;
    }
}