import java.io.*;
import java.util.*;

public class LuckyNumber {
	public static void main(String[] args) {
		int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
		List<Integer> result = new LinkedList<Integer>();
		result = luckyNumbers(matrix);
		System.out.println(result);
	}

	public static List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> minRow = new LinkedList<Integer>();
        List<Integer> maxCol = new LinkedList<Integer>();
        List<Integer> result = new LinkedList<Integer>();

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
        		minElement = Math.min(minElement, matrix[i][j]);
        	}

        	minRow.add(minElement);
        	minElement = Integer.MAX_VALUE;
        }

        for(int i=0;i<matrix[0].length;i++){
        	for(int j=0;j<matrix.length;j++){
        		maxElement = Math.max(maxElement, matrix[j][i]);
        	}
        	maxCol.add(maxElement);
        	maxElement = Integer.MIN_VALUE;
        }

        for(int x:minRow){
        	if (maxCol.contains(x)) {
        		result.add(x);
        	}
        }
        return result;
    }
}