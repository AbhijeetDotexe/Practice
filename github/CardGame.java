import java.io.*;
import java.util.*;

public class CardGame {
	public static int SumDigits(int n){
		int sum = 0;
		if (n==0) {
			return n;
		}else {
			while(n>0){
				sum +=n%10;
				n = n/10;
			}
			return sum;
		}
	}
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
		    int count=0;
		    int c=0;
		    while(n>0){
		    	StringTokenizer bn = new StringTokenizer(br.readLine());
		        float a = Float.parseFloat(bn.nextToken());
		        float b = Float.parseFloat(bn.nextToken());
		        float sum=0;
		        float s=0;
		        while(a>0){
		            s=s+a%10;
		            a=a/10;
		        }
		         while(b>0){
		            sum=sum+b%10;
		            b=b/10;
		        }
		        if(s>sum){
		            count=count+1;
		        }
		        else if(sum>s){
		            c=c+1;
		        }
		        else{
		            c=c+1;
		            count=count+1;
		            }
		        n--;
		    }
		    if(count>c){
		        System.out.println("0 "+count);
		    }
		    else if(c>count){
		        System.out.println("1 "+c);
		    }
		    else{
		        System.out.println("2 "+c);
		    }
		}

	}
}


