import java.io.*;
import java.util.*;

public class test implements Runnable{
	public void run(){ try{
		System.out.println("Hello");
		Thread.sleep(5000);
		System.out.println("This is just for testing purpose, I hope this is working !");
	}catch (Exception e) {
		System.out.println(e);
	}
}
	public static void main(String[] args) {
		test t = new test();
		Thread t2 = new Thread(t);
		t2.start();
	}
}