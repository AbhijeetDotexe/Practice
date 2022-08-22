import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HardestBet {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

			while(t!=0){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if(a<c && a<b)
	    {
	        System.out.println("draw");
	        
	    }
	    else if(b<a && b<c)
	    {
	       System.out.println("bob");
 	    }
	    else {
	        System.out.println("alice");
	    }
	    
	    
	    t--;
	}	}
}
