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

  Tree()
  {
    root = new Node();
  }

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
    if(parent.data > d)
      parent.left = newNode;
    else
    parent.right = newNode;
  }
}

  void output(Node n)
  {
    if(n!=null){
      System.out.println(n.data);
      output(n.left);
      output(n.right);
    }
  }

  void checkBalance()
  {
    Node temp =this.root;
    if(isBalanced(temp)>0)
      System.out.println("It's Balanced");
    else
      System.out.println("It's not Balanced");
  }

  int isBalanced(Node root)
  {
    if(root==null)
      return 0;

    int leftH = isBalanced(root.left);
    if(leftH==-1)
      return -1;
    int rightH = isBalanced(root.right);
    if(rightH==-1)
      return -1;
    if(Math.abs(leftH-rightH)>1)
      return -1;

    return 1+Math.max(leftH,rightH);
  }
}
class ques4
{
  public static void main(String[] args) {

    Tree tree = new Tree(5);
    //tree.add(5);
    tree.add(4);
    tree.add(8);
    tree.output(tree.root);
      System.out.println(tree.root.data);
    tree.checkBalance();
  }
}
