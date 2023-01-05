import java.io.*;
import java.util.*;

public class DiagonalSum {
	public static void main(String[] args) {
		
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(diagonalSum(mat));
	}

	public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int l = mat.length-1;
        for (int i=0;i<mat.length ;i++ ) {
        	sum+= mat[i][i]+ mat[i][l-i];
        }

        if ((l+1)%2!=0) {
        	sum-=mat[l/2][l/2];
        }
        return sum;
    }
}
