class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
          return result;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()) {
          int levelSize = que.size();
          int maxLevelValue = Integer.MIN_VALUE;

          for(int i=0; i<levelSize; i++) {
            TreeNode node = que.poll();
            maxLevelValue = Math.max(maxLevelValue, node.val);

            if(node.left != null) {
              que.offer(node.left);
            }
            if(node.right != null) {
              que.offer(node.right);
            }
          }
          result.add(maxLevelValue);
        }
        return result;
    }
}
