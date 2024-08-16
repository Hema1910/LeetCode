/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

      
    List<List<Integer>>result=new ArrayList<>();
      Queue<TreeNode>q=new LinkedList<>();
   
     if(root==null){
        return result;
      }
       q.offer(root); 
  
    while(!q.isEmpty()){
        int size=q.size();
        List<Integer>list=new ArrayList<>();
        TreeNode temp=null;
        for(int i=0;i<size;i++){
            temp=q.poll();
            list.add(temp.val);
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
            result.add(0,list);
        
        
    }
        return result;
    }

        
 }



        