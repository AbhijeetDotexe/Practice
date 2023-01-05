import java.io.*;
import java.util.*;

public class CountDigits {
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
			int n = 123456789;
			int ans = count(n);
			System.out.println(ans);
		}
	}

    public static int count(int n){
        return helper(n,0);
    }

	public static int helper(int num, int c){

		if(num==0){
        	return c;
    	}
    	return helper(num/10,c+1);
	}
}


