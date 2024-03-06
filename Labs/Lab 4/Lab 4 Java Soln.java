public class Main {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        invertTree(root.right);
        invertTree(root.left);
        if (root.left != null || root.right != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
        return root;
    }


    public static void main(String[] args) {

    }
}
