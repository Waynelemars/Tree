package Tree;

public class Test {

	public static void main(String args[]) {

	BinaryTree bt = new BinaryTree();
	BinaryTree sampleBT = bt.createSampleTree();
	
	System.out.println(sampleBT.maxDepth(sampleBT.getRoot()));
	sampleBT.printTreeFileStructure(sampleBT.getRoot(),0);
    
//	bt.inOrder(sampleBT.root.left);
//	bt.preOrder(sampleBT.root);
//	bt.postOrder(sampleBT.root);
//	bt.levelOrder(sampleBT.getRoot());
//	BinarySearchTree bst = new BinarySearchTree();
//	bst.add("2");
//	bst.add("3");
//	bst.add("1");
//	
//	bst.inOrder(bst.getRoot());
//	System.out.println(bst.find("1").data);
		
		
		
		
	
	}

}
