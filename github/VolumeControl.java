import java.io.*;
import java.util.*;

public class VolumeControl {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i=0;i<t ;i++ ) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int ans ;

			if(x>y){
				ans = x-y;
			}else {
				ans = y-x;
			}
			System.out.println(ans);
		}
	}
}
