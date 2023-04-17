import java.io.*;
import java.util.*;

public class MaxBinary {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine();
            StringBuilder ans = new StringBuilder(s);
            while(k>0){
            	if (ans.charAt(0)=='0') {
            		ans.setCharAt(0, '1');
            		k--;
            	}else{
            		ans.append('0');
            		k--;
            	}
            }
            System.out.println(ans);
        }
	}
}
