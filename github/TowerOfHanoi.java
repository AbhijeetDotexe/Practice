import java.io.*;
import java.util.*;

public class TowerOfHanoi {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		toh(3,'A','B','C');
	}

	public static void toh(int n, char src, char aux, char dest){
		if (n==1) {
			System.out.println(src+"->"+dest);
			return ;
		}
		toh(n-1,src,dest,aux);
		toh(1,src,aux,dest);
		toh(n-1,aux,src,dest);
	}
}
