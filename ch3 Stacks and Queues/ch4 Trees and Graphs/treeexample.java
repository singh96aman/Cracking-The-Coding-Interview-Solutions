import java.util.*;

class node
{
  int data;
  node left;
  node right;

  node(int d)
  {
    data=d;
    left=null;
    right=null;
  }
}

class Tree
{
 node root;

 Tree(int d)
 { root = new node(d); }

 void push(int d)
 {
  node temp = root, parent = root;
  while(temp!=null)
  {
    parent = temp;
    if(temp.data > d)
      temp=temp.left;
    else
      temp=temp.right;
  }
  node newnode = new node(d);
  if(parent.data > d)
    parent.left = newnode;
  else
    parent.right = newnode;
 }

  void outputinorder(node n)
  {
    if(n!=null)
    {
      visit(n);
      outputinorder(n.left);
      outputinorder(n.right);
    }
  }

  // Some error with Tree class

  /*Tree del(Tree root, int key)
  {
    if(root==null)
      return root;

    if(key < root.root.data)
      root.root.left = del(root.left, key);
    else if(key > root.root.data)
      root.root.right = del(root.right, key);
    else
    {
      if(root.root.left == null)
        return root.right;
      else if(root.root.right == null)
        return root.left;

      root.root.data = minValue(root.root.right);
      root.root.right = del(root.root.right, root.root.data);
    }
    return root;
  }

  int minValue(node root)
  {
    int minv = root.data;
    while(root.left != null)
    {
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }
  */


 void visit(node n)
 {
    System.out.println(n.data);
 }
}

class treeexample
{
  public static void main(String[] args) {

    Tree tree = new Tree(5);
    tree.push(3);
    //System.out.println(tree.root.left.data);
    tree.push(7);
    tree.push(2);
    //System.out.println(tree.root.left.data);
    tree.push(6);
    tree.push(0);
    //System.out.println(tree.root.left.data);
    tree.push(1);
    //System.out.println(tree.root.left.data);
    tree.push(7);
    tree.outputinorder(tree.root);
    //System.out.println();

  }
}
