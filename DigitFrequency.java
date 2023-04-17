import java.io.*;
import java.util.*;

public class DigitFrequency {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int ans = getDigitFrequency(n,d);
		System.out.println(ans);
	}

	public static int getDigitFrequency(int n, int d){
		int freq=0;
		while(n>0){
			int dig = n%10;
			n=n/10;

			if (dig==d) {
				freq++;
			}
		}
		return freq;
	}
}
