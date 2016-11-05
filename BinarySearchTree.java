package Tree;

public class BinarySearchTree extends BinaryTree {

	public BinarySearchTree() {

	}

	public void add(String data) {

		if (super.getRoot() == null) {
			super.setRoot(new TreeNode(data));
			return;
		}
		TreeNode node = super.getRoot();
		
		while(true){

		if (data.compareTo(node.data) > 0) {
			if (node.right != null) {
				node = node.right;
			} else {
				node.right = new TreeNode(data);
				return;
			}

		} else if (data.compareTo(node.data) < 0) {
			if (node.left != null) {
				node = node.left;
			}
			else{
				node.left=new TreeNode(data);
				return;
				
			}
		}

	}
	}

	public void find(String data) {
		
		
		

	}

}
