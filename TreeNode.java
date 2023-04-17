import java.io.*;
import java.util.*;

public class TreeNode {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		TreeNodes drinks = new TreeNodes("Drinks");
		TreeNodes hot = new TreeNodes("Hot");
		TreeNodes cold  = new TreeNodes("Cold");
		drinks.addChildren(hot);
		drinks.addChildren(cold);
		System.out.println(drinks.print(0));
	}

}

class TreeNodes{
	String data;
	ArrayList<TreeNodes> children;


	public TreeNodes(String data){
		this.data = data;
		this.children = new ArrayList<TreeNodes>();
	}


	public void addChildren(TreeNodes nodes){
		this.children.add(nodes);
	}

	public String print(int level){
		String ret;
		ret = " ".repeat(level)+data+"\n";
		for (TreeNodes node:this.children)  {
			ret+=node.print(level+1);
		}
		return ret;
	}
}
