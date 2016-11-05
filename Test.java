package Tree;

public class Test {

	public static void main(String args[]) {

	BinaryTree bt = new BinaryTree();
	BinaryTree sampleBT = bt.createSampleTree();
    
//	bt.inOrder(sampleBT.root.left);
//	bt.preOrder(sampleBT.root);
//	bt.postOrder(sampleBT.root);
	bt.levelOrder(null);
		
		
		
		
	
	}

}
