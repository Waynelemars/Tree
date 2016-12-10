package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private TreeNode root;
	public BinaryTree(){
		
	}
	//didn't solve it.
	
	public void printTreeFileStructure(TreeNode node,int level){
		
		if(node==null){
			return;
		}
		
		//this for loop make sure no matter where your nodes are, you will know the level of the node. 
		for ( int i = 0; i < level; i++ ) {
			System.out.print("   ");
		}
		
		System.out.println("└"+node.data);
		printTreeFileStructure(node.left,level+1);
		printTreeFileStructure(node.right,level+1);
		
		
		
		
		
	}
	
	
	
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		else{
			return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
		}
		
		
		
	}
	
	public TreeNode getRoot(){
		return root;
	}
	
	public void setRoot(TreeNode root){
		this.root=root;
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
	
	
	public void levelOrder(TreeNode subTree){
		
		if(subTree!=null){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.add(subTree);
		while(!q.isEmpty()){
			
			TreeNode current = q.poll();
			System.out.println(current.data);
			if(current.left!=null){
				q.add(current.left);
			}
			if(current.right!=null){
				q.add(current.right);
			}
		}
		}
		
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
