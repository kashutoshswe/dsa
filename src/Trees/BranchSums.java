public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> branchSums = new ArrayList<Integer>();
        branchSumsHelper(root, branchSums, 0);
        return branchSums;
    }

    public static List<Integer> branchSumsHelper(BinaryTree root, List<Integer> branchSums, int sum)
    {
        //to handle in case if node is having only either left or right children
        if(root == null)
            return branchSums;

        sum += root.value;
        if(root.left == null && root.right == null) {
            branchSums.add(sum);
            return branchSums;
        }
        branchSumsHelper(root.left, branchSums, sum);
        branchSumsHelper(root.right, branchSums, sum);
        return branchSums;
    }
}