import java.io.*;
import java.util.*;

public class ValidPalindrome {
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
			// StringTokenizer st = new StringTokenizer(br.readLine());
			String s = "A man, a plan, a canal: Panama";
			String a = "race a car";
			boolean ans = isPalindrome(a);
			System.out.println(ans);
		}
	}

	 public static boolean isPalindrome(String s) {
        
        int left=0, right=s.length()-1;
        while(left<right){
        	char l=s.charAt(left), r=s.charAt(right);
        	if (!Character.isLetterOrDigit(l)) {
        		left++;
        	}else if (!Character.isLetterOrDigit(r)) {
        		right--;
        	}else if (Character.toLowerCase(l)!=Character.toLowerCase(r)) {
        		return false;
        	}else {
        		left++;
        		right--;
        	}
        }
        return true;
    }
}
