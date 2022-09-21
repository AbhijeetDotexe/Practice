import java.io.*;
import java.util.*;

public class InsertionSorting {
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
		int[] arr = {5,6,2,3,1,8,7,9,4};
        int[] arr1 = {1,2,3,4,5,6,7,-21,-32,-4,-15,0};
        int[] c ={5,4,3,2,1};
        insertionSort(c);
        System.out.println(Arrays.toString(c));
		}
	}

	public static void insertionSort(int[] arr){
		for (int i=0;i<arr.length-1;i++ ) {
			for (int j=i+1;j>0;j-- ) {
				if (arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
	}
}
