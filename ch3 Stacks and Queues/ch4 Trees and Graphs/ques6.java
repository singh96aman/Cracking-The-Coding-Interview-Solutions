import java.util.*;

class Node{
  int data;
  Node left, right, parent;

  Node()
  {}

  Node(int d)
  {
      data = d;
      left = null;
      right = null;
      parent = null;
  }
}


class Tree{
  Node root;

  Tree()
  {root = new Node();}

  Tree(int d)
  { root = new Node(d);}

  void add(int d)
  {
    Node temp=root, parent=root;
    Node newNode = new Node(d);
    if(temp==null)
      root=newNode;
      else{
    while(temp!=null)
    {
      parent = temp;
      if(temp.data > d)
        temp = temp.left;
      else
        temp = temp.right;
    }
    newNode.parent = parent;
    if(parent.data > d)
      parent.left = newNode;
    else
      parent.right = newNode;
  }
}

Node inorderSucc(Node n)
{
  if(n==null)
    return null;

  if(n.right!=null)
    return leftMostChild(n.right);
  else{
    Node q = n;
    Node x = q.parent;
    while(x!=null && x.left!=q){
      q=x;
      x=x.parent;
    }
    return x;
  }
}

Node leftMostChild(Node n){
  if(n==null)
    return null;
  while(n.left!=null)
    n=n.left;
  return n;
}

void outputinorder(Node n)
{
  if(n!=null)
  {
    System.out.println(n.data);
    outputinorder(n.left);
    outputinorder(n.right);
  }
}
}

class ques6
{
  public static void main(String[] args) {

    Tree tree = new Tree(4);
    tree.add(5);
    tree.add(3);
    tree.add(8);
    tree.outputinorder(tree.root);
    Node n = tree.inorderSucc(tree.root.right);
    System.out.println(n.data);

  }
}
