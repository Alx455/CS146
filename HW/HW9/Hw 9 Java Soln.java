public class Main {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode it = root;
        boolean found = false;
        while (!found) {
            if ((p.val >= it.val && q.val <= it.val) || (p.val <= it.val && q.val >= it.val))
                found = true;
            else if (p.val > it.val && q.val > it.val)
                it = root.right;
            else
                it = root.left;
        }
        return it;
    }


    public static void main(String[] args) {
        
    }
}
