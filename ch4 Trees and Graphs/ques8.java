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
      System.out.println(n.data);
      outputinorder(n.left);
      outputinorder(n.right);
    }
  }

  void firstCommonAncestor(int d1, int d2, node n)
  {
    int found=0;
    while(n.left!=null && n.right!=null)
    {
      find(d1,n.left,found);
      if(found==1)
      {
        found=0;
        find(d2, n.right,found);
        if(found==1)
          System.out.println("Ancestor found at n.data");
      }
      found=0;
      firstCommonAncestor(d1, d2, n.left);
      firstCommonAncestor(d1, d2, n.right);
    }
  }

  void find(int d, node n,int found)
  {
    while(n!=null)
    {
      if(n.data==d)
        found=1;
      find(d,n.left,found);
      find(d,n.right,found);
    }
  }
}

class ques8
{
  public static void main(String[] args) {

    Tree t = new Tree(3);
    t.push(5);
    t.push(1);
    t.push(4);
    t.push(6);
    t.push(8);
    //if(t.firstCommonAncestor(10,9,t.root))
      //System.out.println("found");
    t.firstCommonAncestor(4,6,t.root);
  }
}
