package Trees;

public  class ClosestValueInBst {
    public static int findClosestValueInBst(BST tree, int target) {
        BST currentNode = tree;
        int closestValue = 0;
        int absDiff = Integer.MAX_VALUE;
        while (currentNode != null) {
            int currentDiff = Math.abs(currentNode.value - target);
            if (currentDiff < absDiff) {
                absDiff = currentDiff;
                closestValue = currentNode.value;
            }
            if (target == currentNode.value)
                return currentNode.value;
            else if (currentNode.value > target)
                currentNode = currentNode.left;
            else if (currentNode.value < target)
                currentNode = currentNode.right;
        }
        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}