/*
Given a non-empty binary tree, return the average value of 
the nodes on each level in the form of an array.
3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, 
and on level 2 is 11. Hence return [3, 14.5, 11].
*/
public class averageOfLevels637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int n = q.size();
            double avg = 0;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);

            }
            avg = sum / n;
            list.add(avg);
        }
        return list;
    }

}