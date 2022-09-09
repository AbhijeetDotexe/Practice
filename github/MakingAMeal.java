import java.io.*;
import java.util.*;

public class MakingAMeal {
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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int min = Integer.MAX_VALUE;
			int[] arr = new int[6];
			for (int i=0;i<n ;i++ ) {
				String s = br.readLine();
				for (int j=0;j<s.length() ;j++ ) {
					if (s.charAt(j)=='c') {
						arr[0]+=1;
					}else if (s.charAt(j)=='o') {
						arr[1]+=1;
					}else if (s.charAt(j)=='d') {
						arr[2]+=1;
					}else if (s.charAt(j)=='e') {
						arr[3]+=1;
					}else if (s.charAt(j)=='h') {
						arr[4]+=1;
					}else if (s.charAt(j)=='f') {
						arr[5]+=1;
					}else {
						continue;
					}
				}
			}
				arr[0]/=2;
				arr[3]/=2;
				for(int k=0;k<6;k++){
					if (arr[k]<min) {
						min = arr[k];
					}
				}
			System.out.println(min);
		}
	}
}
