import java.io.*;
import java.util.*;

public class ChefAndDigit {
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
			String s = br.readLine();
			int countZero = 0, countOne = 0;
			for (int i=0;i<s.length();i++ ) {
				if (s.charAt(i)=='0') {
					countZero+=1;
				}else {
					countOne+=1;
				}
			}
			if (countOne==1 || countZero==1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
