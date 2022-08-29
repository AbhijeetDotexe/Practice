import java.io.*;
import java.util.*;

public class ArmstrongNumber {
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
			String ans = armstrongNumber(n);
			System.out.println(ans);
    	}
    }
		public static String armstrongNumber(int n){
		int OriginalNumber = n;
			int count = 0;
			int temp = n;
			while(temp!=0){
				count++;
				temp = temp/10;
			}
			int sum = 0;
			while(n!=0){
				int digit = n%10;
				sum += Math.pow(digit,count);
				n = n/10;
			}
			return sum==OriginalNumber? "Yes":"No";	
		}

	}

