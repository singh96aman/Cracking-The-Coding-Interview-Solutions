import java.util.*;

class Node{
  int data;
  Node left, right;

  Node()
  {}

  Node(int d)
  {
      data = d;
      left = null;
      right = null;
  }
}


class Tree{
  Node root;
  Integer last_printed;

  Tree()
  {root = new Node();
   last_printed = null;}

  Tree(int d)
  { root = new Node(d);
    last_printed = null;}

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
    if(parent.data > d)
      parent.left = newNode;
    else
    parent.right = newNode;
  }
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

  boolean checkBST(Node n)
  {
    if(n==null)
      return true;
    if(!checkBST(n.left))
      return false;
    if(last_printed!=null && n.data <= last_printed)
      return false;

    last_printed = n.data;

    if(!checkBST(n.right))
      return false;

    return true;
  }
}

class ques5
{
  public static void main(String[] args) {

    Tree t = new Tree();
    for(int i=1; i<5; i++)
      t.add(i);
    if(t.checkBST(t.root))
      System.out.println("BST");
    else
    System.out.println("Not BST");
    t.outputinorder(t.root);

  }
}
