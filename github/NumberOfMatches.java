import java.io.*;
import java.util.*;

public class NumberOfMatches {
	public static void main(String[] args) {
		int ans = numberOfMatches(7);
			System.out.println(ans);
	}

	public static int numberOfMatches(int n) {
		int ans = 0;
		while(n>1){
			int matches = n/2;
			n = n-matches;
			ans+=matches;
		}
        return ans;
    }
}