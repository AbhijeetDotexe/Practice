import java.io.*;
import java.util.*;

public class SetZero {
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
			int[][] matrix = {{1,2,3},{4,0,6},{7,8,9}};
			setZeroes(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
	}

	public static void setZeroes(int[][] matrix) {
        int col0=1, rows=matrix.length, cols=matrix[0].length;

        for (int i=0;i<rows ;i++ ) {
        	if(matrix[i][0] == 0) col0=0;
        	for (int j=1;j<cols ;j++ ) {
        		if (matrix[i][j] == 0) {
        			matrix[i][0] = matrix[0][j] = 0;
        		}
        	}
        }

        for (int i=rows-1;i>=0 ;i-- ) {
        	for (int j=cols-1;j>=1 ;j-- ) {
        		if (matrix[i][0]==0 || matrix[0][j]==0) {
        			matrix[i][j]=0;
        		}
        	}
        	if(col0==0) matrix[i][0]=0;
        }
    }
}
