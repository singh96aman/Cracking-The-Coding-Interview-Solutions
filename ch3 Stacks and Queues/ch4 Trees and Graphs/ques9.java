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
 ArrayList<Integer> list;

 Tree(int d)
 { root = new node(d);
 list = new ArrayList<Integer>();}

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
      //System.out.println(n.data);
      outputinorder(n.left);
      outputinorder(n.right);
    }
  }

  void BSTseq1(node n)
  {
    if(n!=null)
    {
      list.add(n.data);
      BSTseq1(n.left);
      BSTseq1(n.right);
    }
  }

  void BSTseq2(node n)
  {
    if(n!=null)
    {
      list.add(n.data);
      BSTseq2(n.right);
      BSTseq2(n.left);
    }
  }
  ArrayList<Integer> getArray()
  {
      return list;
  }
}

class ques9
{
  public static void main(String[] args) {

    Tree t = new Tree(5);
    t.push(1);
    t.push(3);
    t.push(2);
    t.push(4);
    t.push(7);
    //t.outputinorder(t.root);
    ArrayList<Integer> i = new ArrayList<Integer>();
    //t.BSTseq1(t.root);
    //i = t.getArray();
    //System.out.println(i);
    t.BSTseq2(t.root);
    i = t.getArray();
    System.out.println(i);

  }
}
