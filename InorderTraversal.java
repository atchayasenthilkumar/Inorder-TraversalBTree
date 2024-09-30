class solution
{
public List<Integer>inorderTraversal(TreeNode root)
{
if(root==null)
{
return new ArrayList<>();
}
else
{
List<Integer>  a=inorderTraversal(root.left);
System.out.println(root.val);
List<Integer>  b=inorderTraversal(root.right);
List<Integer> result =new ArrayList<>();
result.addAll(inorderTraversal(root.left));
result.add(root.val);
result.addAll(inorderTraversal(root.right));

return result;
}
}
}

