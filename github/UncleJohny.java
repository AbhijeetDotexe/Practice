import java.io.*;
import java.util.*;

public class UncleJohny {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i=0;i<n ;i++ ) {
				arr[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int val = 0;
			for (int l=0;l<n ;l++ ) {
				if (l == k-1) {
					val = arr[l];
				}
			}
			Arrays.sort(arr);
			for (int j=0;j<n ;j++ ) {
				if (arr[j] == val) {
					System.out.println(j+1);
				}else {
					continue;
				}
			}
		}
	}
}
