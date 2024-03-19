import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null)
            return null;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int x = nodes.size();
            int i = 0;
            while(i < x) {
                TreeNode n = nodes.poll();
                if (n.left != null)
                    nodes.add(n.left);
                if (n.right != null)
                    nodes.add(n.right);
                level.add(n.val);
                i++;
            }
            levels.add(level);
        }
        return levels;
    }


    public static void main(String[] args) {
        
    }
}
