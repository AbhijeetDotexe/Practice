import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int t = Integer.parseInt(br.readLine());
		// Scanner sc = new Scanner(System.in);
			inputSomeElements i = new inputSomeElements(3);
			i.inp();
			i.out();
			// Final static int a =4;
	}

public static class inputSomeElements{
	int t;
	int arr[];
	Scanner sc = new Scanner(System.in);
	inputSomeElements(int n){
		this.t = n;
		this.arr = new int[n];
	}
	void inp(){
		for (int i=0;i<t;i++ ) {
			// System.out.println(arr.length);
			// System.out.println(t);
			System.out.println("Input the element");
			arr[i] = sc.nextInt();
		}
	}
	void out(){
		Arrays.toString(arr);
	}
}

}
