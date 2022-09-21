import java.io.*;
import java.util.*;

public class PlusOne {
	public static void main(String[] args) {
		// int[] digits = {4,3,2,1};
		int[] digits = {9};
		int[] ans = plusOne(digits);
		System.out.println(Arrays.toString(ans));
		int a = 4322;
		int x;
		while(a>0){
        			x = a%10;
        			System.out.println(x);
        			a = a/10;
        		}

	}
	 public static int[] plusOne(int[] digits) {
	 	 if(digits.length == 1){
            for(int i=0;i<digits.length;i++){
                if(digits[i]<9){
                    int x = digits[i]+1;
                    return new int[]{x};
                }
            }
        }
        int number = 0;
        for(int i=0;i<digits.length;i++){
        	if(i<digits.length-1){
        		number += digits[i];
        		number*=10;
        	} else {
        		number+=digits[i];
        	}
        }
        	number+=1;
        	int[] ans = new int[digits.length];
        	int[] a = new int[digits.length+1];
        	int x ;
        	if (digits.length == 1) {
        		
        		for(int i=a.length-1;i>=0;i--){
        		if(number>0){
        			x = number%10;
        			a[i] = x;
        			number = number/10;
        		}
        	}
        	}else{
        	
        	for(int i=ans.length-1;i>=0;i--){
        		if(number>0){
        			x = number%10;
        			ans[i] = x;
        			number = number/10;
        		}
        	}
        }
        return digits.length<2 ? a:ans;
    }
    
    }