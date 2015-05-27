class TreeNode {
	public int val;
	public TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		/*TreeNode root = new TreeNode(1);
		TreeNode depthOneLeft = new TreeNode(2);
		TreeNode depthOneRight = new TreeNode(3);
		TreeNode depthTwoLeft = new TreeNode(4);
		TreeNode depthTwoRight = new TreeNode(5);

		root.left = depthOneLeft;
		root.right = depthOneRight;
		depthOneRight.left = depthTwoLeft;
		depthOneRight.right = depthTwoRight;*/
		
		TreeNode root = null;
		
		System.out.print(maxDepth(root));
	}

	public static int maxDepth(TreeNode root) {
		
		if(root == null)
			return 0;
		int h = 1;
		if (root.left != null)
			h = Math.max(h, 1 + maxDepth(root.left));
		if (root.right != null)
			h = Math.max(h, 1 + maxDepth(root.right));

		return h;
	}

}
