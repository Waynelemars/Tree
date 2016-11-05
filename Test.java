package Tree;

public class Test {

	public static void main(String args[]) {

		TreeNode root = new TreeNode("80");
		root.left = new TreeNode("59");
		root.left.left= new TreeNode("19");
		root.left.right= new TreeNode("78");
		root.right= new TreeNode("95");
		
		root.print();
		root.left.print();
		root.right.print();
		root.left.left.print();
		root.left.right.print();
		
	
	}

}
