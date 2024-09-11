package Trees;

public class NodeDepth {
    public static int nodeDepths(BinaryTree root) {
        int depth = 0;
        depth = nodeDepthsHelper(root, depth);
        return depth;
    }

    public static int nodeDepthsHelper(BinaryTree root, int depth) {
        if(root == null)
            return 0;
        return depth + nodeDepthsHelper(root.left, depth+1) + nodeDepthsHelper(root.right, depth+1);
    }

    private static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}