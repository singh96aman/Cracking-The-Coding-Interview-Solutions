import java.util.*;

class Node{
  int data;
  Node left, right;
  int level;

  Node()
  {}

  Node(int d, int l)
  {
      data = d;
      left = null;
      right = null;
      level=l;
  }
}
class Linked
{
  Integer data;
  Linked next;
  Linked()
  {}
  Linked(int d)
  { data = d;
  next = null; }
  Linked add(int d)
  {
    Linked newNode = new Linked(d);
    Linked temp = this;
    newNode.next=temp;
    return newNode;
  }
}

class Tree{
  Node root;
  int noOfNodes;
  Linked[] listOfDepth;

  Tree()
  {
    root = new Node();
    noOfNodes=0;
  }

  Tree(int d)
  { root = new Node(d);
    noOfNodes=1;}

  void add(int d)
  {
    Node temp=root, parent=root;
    int level=0;
    if(temp==null)
    {
      root=newNode;
      Node newNode = new Node(d,level);
    }
      else{
    while(temp!=null)
    {
      level++;
      parent = temp;
      if(temp.data > d)
        temp = temp.left;
      else
        temp = temp.right;
    }
    level++;
      Node newNode = new Node(d,level);
    if(parent.data > d)
      parent.left = newNode;
    else
    parent.right = newNode;
  }
    noOfNodes++;
  }

  int depth(Node n)
  {
      if(n==null)
        return 0;
      if(n.left==null && n.right==null)
        return 1;
      if(n.left==null)
        return depth(n.right)+1;
      if(n.right==null)
        return depth(n.left)+1;
      return Math.min(depth(n.left),depth(n.right))+1;
  }

  /*void listAllDepth()
  {
    int h = depth(tree.root);
    listOfDepth = new Linked[h];
    for(int i=0; i<h; i++)
    {
      listOfDepth[i] = new Linked();

    }
  }
  */

  // Complete the solution. Problem is to check for the same level as i
  // and insert into linked list. Take care of recursion
}
