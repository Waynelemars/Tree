package Tree;

public class BinaryTree {

	public TreeNode root;
	public BinaryTree(){
		
	}
	
	public void inOrder(TreeNode subTree){
		
		if(subTree==null){
			return;
		}
		
		inOrder(subTree.left);
		System.out.println(subTree.data);
		inOrder(subTree.right);
		
	}
	
	public void preOrder(TreeNode subTree){
		
		if(subTree==null){
			return;
		}
		System.out.println(subTree.data);
		preOrder(subTree.left);
		preOrder(subTree.right);
		
		
	}
	
	public void postOrder(TreeNode subTree){
		
		if(subTree==null){
			return;
		}
		postOrder(subTree.left);
		postOrder(subTree.right);
		System.out.println(subTree.data);
		
	}
	
	
	public BinaryTree createSampleTree(){
		BinaryTree t= new BinaryTree();
		t.root=new TreeNode("Les");
		t.root.left = new TreeNode("Cathy");
		t.root.left.left= new TreeNode("Alex");
		t.root.left.right= new TreeNode("Frank");
		t.root.right= new TreeNode("Sam");
		t.root.right.left= new TreeNode("Nancy");
		t.root.right.right = new TreeNode("Violet");
		t.root.right.right.left= new TreeNode("Tony");
		t.root.right.right.right= new TreeNode("Wendy");
		return t;
	}
	
	
	
	
}
