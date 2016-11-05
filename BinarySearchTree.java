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

		while (true) {

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
				} else {
					node.left = new TreeNode(data);
					return;

				}
			}

		}
	}

	public TreeNode find(String data) {

		if (super.getRoot() == null) {
			return null;
		}

		TreeNode current = super.getRoot();
		while (true) {
			if (data.compareTo(current.data) > 0) {
				if (current.right == null) {
					return null;
				}
				current = current.right;
			}

			if (data.compareTo(current.data) < 0) {
				if (current.left == null) {
					return null;
				}
				current= current.left;

			}

			if (data.compareTo(current.data) == 0) {
				return current;
			}

		}
	}

}
