import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;


  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }


class Postorder {
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {


        if(root==null)
        {
            return list;

        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.val);
        list.add(root.val);
        return list;

    }
}