import java.io.*;
import java.util.*;

public class BarGraph {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n ;i++ ) {
			arr[i] = sc.nextInt();
		}
		int[] brr = Arrays.copyOfRange(arr,0,n);
		Arrays.sort(brr);
		int max = brr[n-1];
		for (int floor=max;floor>=1 ;floor-- ) {
			for (int i=0;i<n ;i++ ) {
				if (arr[i]>=floor) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}
}
