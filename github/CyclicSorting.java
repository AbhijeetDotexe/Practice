import java.io.*;
import java.util.*;

public class CyclicSorting {
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
		int[] arr = {3,6,5,2,1,4};
        int[] ar = {5,6,2,3,1,8,7,9,4};
        int[] arr1 = {1,2,3,4,5,6,7,-21,-32,-4,-15,0};// will not work because they are not continuous numbers
        int[] c ={5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

		}
	}

	public static void cyclicSort(int[] arr){
		int i=0;
		while(i<arr.length){
			int correcIndex = arr[i]-1;
			if (arr[i]!=arr[correcIndex]) {
				int temp = arr[i];
				arr[i] = arr[correcIndex];
				arr[correcIndex] = temp;
			}else {
				i++;
			}
		}
	}
}
