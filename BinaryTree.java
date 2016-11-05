package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private TreeNode root;
	public BinaryTree(){
		
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
