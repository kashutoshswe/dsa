public class NodeDepth {
    public static int nodeDepths(BinaryTree root) {
        int sum = 0;
        nodeDepthsHelper(root, sum);
        return sum;
    }

    public static int nodeDepthsHelper(BinaryTree root, int sum) {
        if(root == null)
            return sum;
        sum+=1;
        nodeDepthsHelper(root.left, sum);
        nodeDepthsHelper(root.right, sum);
        return sum;
    }

    static class BinaryTree {
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