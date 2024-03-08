public class Main {
    public static boolean isValidBST(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                if (root.val < root.left.val)
                    return false;
                if (root.left.right != null && root.val < root.left.right.val)
                    return false;
            }
            if (root.right != null) {
                if (root.val > root.right.val)
                    return false;
                if (root.right.left != null && root.val > root.right.left.val)
                    return false;
            }
            return isValidBST(root.left) && isValidBST(root.right);
        }
        return true;
    }


    public static void main(String[] args) {
        
    }
}
