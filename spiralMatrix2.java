import java.io.*;
import java.util.*;

public class spiralMatrix2 {
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
			int n = 3;
			int[][] ans = new int[3][3];
			ans = generateMatrix(n);		
			System.out.println(Arrays.deepToString(ans));
		}
	}

	public static int[][] generateMatrix(int n){
		int t=0, b=n-1, l=0, r=n-1, d=0;
		int[][] ans = new int[n][n];
		int num=1;
		while(t<=b && l<=r){
			if (d==0) {
				for (int i=l;i<=r ;i++ ) {
					ans[t][i]=num;
					num++;
				}
				t++;
				d=1;
			}else if(d==1){
				for (int i=t;i<=b ;i++ ) {
					ans[i][r]=num;
					num++;
				}
				r--;
				d=2;
			}else if (d==2) {
				for (int i=r;i>=l ;i-- ) {
					ans[b][i]=num;
					num++;
				}
				b--;
				d=3;
			}else if (d==3) {
				for (int i=b;i>=t ;i-- ) {
					ans[i][l]=num;
					num++;
				}
				l++;
				d=0;
			}
		}
		return ans;
	}
}
