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
 static int sum, noOfNodes;

 Tree(int d)
 { root = new node(d);
 list = new ArrayList<Integer>();
sum=0; noOfNodes=0;}

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

  void countSum(node n, int s)
  {
    if(n!=null && sum<s)
    {
      sum+=n.data;
      noOfNodes++;
      //System.out.println(n.data);
      countSum(n.left,s);
      countSum(n.right,s);
    }
  }
}

class ques12
{
  public static void main(String[] args) {

    Tree tree = new Tree(5);
    tree.push(3);
    tree.push(6);
    tree.push(1);
    tree.push(8);
    //tree.outputinorder(tree.root);
    tree.countSum(tree.root,14);
    System.out.println(tree.noOfNodes);

  }
}
