package Trees;

public class EvaluateExpressionTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        if(tree.value > 0)
            return tree.value;
        int nodeValue = tree.value;
        if(nodeValue == -4)
            return evaluateExpressionTree(tree.left)*evaluateExpressionTree(tree.right);
        else if(nodeValue == -3)
            return evaluateExpressionTree(tree.left)/evaluateExpressionTree(tree.right);
        else if(nodeValue == -2)
            return evaluateExpressionTree(tree.left)-evaluateExpressionTree(tree.right);
        else if(nodeValue == -1)
            return evaluateExpressionTree(tree.left)+evaluateExpressionTree(tree.right);
        return nodeValue;
    }
}
