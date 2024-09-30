IN-ORDER TRAVERSAL:
  
Inorder traversal is defined as a type of tree traversal technique which follows the Left-Root-Right pattern, such that:

* The left subtree is traversed first
* Then the root node for that subtree is traversed
* Finally, the right subtree is traversed

ALGORITHM:  
Inorder(root):


1.If root is NULL, then return
2.Inorder (root -> left)
3.Process root (For example, print root’s data)
4.Inorder (root -> right)
