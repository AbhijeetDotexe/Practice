import java.io.*;
import java.util.*;

public class PrimeFactors {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> ans = new ArrayList<>();
		for (int i=2;i*i<n ;i++ ) {
			while(n%i==0){
				ans.add(i);
				n/=i;
			}
		}
		if (n>1) {
			ans.add(n);
		}
		for(Integer i: ans){
			System.out.print(i+" ");
		}
	}

}
