import java.io.*;
import java.util.*;

public class ChefAndCoupon {
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
			int d = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int sum1=0, sum2=0;
			int[] arr = new int[3];
			int[] brr = new int[3];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			String li = br.readLine();
			String[] str = li.trim().split("\\s+");
			for (int i=0;i<3;i++) {
				arr[i] = Integer.parseInt(strs[i]);
				sum1+=arr[i];
			}
			for (int j=0;j<3;j++) {
				brr[j] = Integer.parseInt(str[j]);
				sum2+=brr[j];
			}
			if(sum1>=150 && sum2>=150 && (sum1+sum2+c)<(sum1+sum2+(2*d))){
		        System.out.println("YES");
		    }
		    else if(sum1>=150 && sum2<150 && (sum1+sum2+c+d)<(sum1+sum2+(2*d))){
		        System.out.println("YES");
		    }
		    else if(sum2>=150 && sum1<150 && (sum1+sum2+c+d)<(sum1+sum2+(2*d))){
		        System.out.println("YES");
		    }
		    
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
