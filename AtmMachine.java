import java.io.*;
import java.util.*;

public class AtmMachine {
	public static void main(String[] args) throws java.lang.Exception,IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
	 Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();

        while (items > 0) {
            String ans = "";
            int peps = sc.nextInt();
            int money = sc.nextInt();
            sc.nextLine();
            String[] transactions = sc.nextLine().split(" ");

            for(int i=0; i<peps; i++) {
                int currBalance = money - Integer.parseInt(transactions[i]);
                if(currBalance >= 0) {
                    ans += "1";
                    money = currBalance;
                } else {
                    ans += "0";
                }
            }
            System.out.println(ans);
            items--;
		}
	}
}
