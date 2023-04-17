import java.io.*;
import java.util.*;

public class spiralMatrix {
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
			int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
			List<Integer> ans = new ArrayList();
			ans = spiralOrder(matrix);
			System.out.println(ans);
		}
	}

	public static List<Integer> spiralOrder(int[][] matrix){
		int row = matrix.length;
		List<Integer> list = new ArrayList<Integer>();
		if (row==0) {
			return list;
		}
		int col = matrix[0].length;
		int l=0,r=col-1,t=0,b=row-1,d=0;
		while(l<=r && t<=b){
			if (d==0) {
				for (int i=l;i<=r ;i++ ) {
					list.add(matrix[t][i]);
				}
				t++;
				d=1;
			}else if(d==1){
				for (int i=t;i<=b ;i++ ) {
					list.add(matrix[i][r]);
				}
				r-=1;
				d=2;

			}else if (d==2) {
				for (int i=r;i>=l ;i-- ) {
					list.add(matrix[b][i]);
				}
				b-=1;
				d=3;
			}
			else if (d==3) {
				for (int i=b;i>=t;i-- ) {
					list.add(matrix[i][l]);
				}
				l++;
				d=0;
			}
		}
		return list;
	}
}
