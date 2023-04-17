import java.io.*;
import java.util.*;

public class ChefHeist {
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
		   String line = br.readLine();
		   String[] strs = line.trim().split("\\s+");
		   long TotalDays = Long.parseLong(strs[0]);     
	       long DaysInter = Long.parseLong(strs[1]);     
	       long InitialSpeed = Long.parseLong(strs[2]);  
	       long Increase = Long.parseLong(strs[3]);
		   long series = TotalDays/DaysInter; 
	       long totalsum = 0; 
	       long remainder = TotalDays%DaysInter; 
	       long remaindersum = 0; 
	       totalsum = (series*(2*InitialSpeed + (series-1)*Increase))/2;
	       totalsum = totalsum*DaysInter; 
	       if (remainder!=0) {
	           remaindersum = remainder * (InitialSpeed+series*Increase); 
	       }
	       System.out.println(totalsum+remaindersum);
		}
	}
}
