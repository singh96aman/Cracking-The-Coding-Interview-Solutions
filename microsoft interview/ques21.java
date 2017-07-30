/*
Diameter of a Binary Tree
The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two leaves in the tree.
The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).
The diameter is through the center.
*/
import java.util.*;

class node{
  int data;
  node left;
  node right;

  node(int d){
    data=d;
    left=null;
    right=null;
  }
}

class Tree{
  node head;

  Tree(int d){
    head = new node(d);
  }

  void push(int d)
  {
    node temp = head, parent=head;
    while(temp!=null){
      parent=temp;
      if(temp.data>d)
        temp=temp.left;
      else
        temp=temp.right;
    }

    node newnode = new node(d);
    if(parent.data>d)
      parent.left=newnode;
    else
      parent.right=newnode;
  }

  void output(node temp){
    if(temp!=null){
      System.out.println(temp.data);
      output(temp.left);
      output(temp.right);
    }
  }

  int height(node n){
    if(n==null)
      return 0;

    return 1 + max(height(n.left),height(n.right));
  }

  int max(int a, int b){
    return (a>=b)? a:b;
  }
}

class ques21{
  public static void main(String[] args) {
    Tree t = new Tree(5);
    t.push(3);
    t.push(1);
    t.push(4);
    t.push(6);
    t.push(9);
    t.push(2);
    System.out.println(t.height(t.head.left)+t.height(t.head.right));
  }
}
