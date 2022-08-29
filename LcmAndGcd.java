import java.io.*;
import java.util.*;

public class LcmAndGcd {
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
			Long a = Long.parseLong(st.nextToken());
			Long b = Long.parseLong(st.nextToken());
			Long c = gcd(a,b);
			Long d = Lcm(a,b);
			Long[] arr = new Long[2];
			arr[0] = d;
			arr[1] = c;
			System.out.println(Arrays.toString(arr));
		}
	}

    static Long gcd(Long a, Long b){
    	if (b==0) {
    		return a;
    	}
    	return gcd(b, a%b);
    }

    static Long Lcm(Long a, Long b){
    	Long x = gcd(a,b);
    	Long lcm = (a*b)/x;
    	return lcm;
    }
}
