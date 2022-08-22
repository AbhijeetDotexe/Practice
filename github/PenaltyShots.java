import java.io.*;
import java.util.*;

public class PenaltyShots {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i=0;i<t;i++ ) {
			int team1 = 0;
			int team2 = 0;
			int[] shot = new int[10];
			for (int k=0;k<10 ;k++ ) {
				shot[k] = sc.nextInt();
				if (k%2!=0) {
					team1+= shot[k];
				}else {
					team2+= shot[k];
				}
			}

			if (team2 == team1) {
				System.out.println(0);
			}else if(team2>team1){
				System.out.println(1);
			}else {
				System.out.println(2);
			}

		}
	}
}
