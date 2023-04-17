import java.io.*;
import java.util.*;

public class SubsetOfAnArray {
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
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = sc.nextInt();
		}

		int limit = (int)Math.pow(2,n);
		for (int i=0;i<limit ;i++ ) {
			String set = "";
			int temp =  i;
			for (int j=n-1;j>=0 ;j-- ) {
				int r = temp%2;
				temp = temp/2;

				if (r==0) {
					set = "_"+set;
				}else {
					set = arr[j]+set;
				}
			}
			System.out.println(set);
		}
		
	}

}
