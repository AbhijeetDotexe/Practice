import java.io.*;
import java.util.*;

public class RotateMatrix {
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
			int[][]  matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
			rotate(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
	}
	public static void rotate(int[][] matrix) {
        for (int i=0;i<matrix.length ;i++ ) {
        	for (int j=i;j<matrix[0].length ;j++ ) {
        		int temp=0; 
        		temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        }

        for (int i=0;i<matrix.length ;i++ ) {
        	for (int j=0;j<matrix.length/2 ;j++ ) {
        		int temp=0; 
        		temp = matrix[i][j];
        		matrix[i][j] = matrix[i][matrix.length-1-j];
        		matrix[i][matrix.length-1-j] = temp;
        	}	
        }
    }
}
