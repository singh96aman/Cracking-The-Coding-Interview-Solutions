/*
Print nodes at k distance from root
Given a root of a tree, and an integer k. Print all the nodes which are at k distance from root.

For example, in the below tree, 4, 5 & 8 are at distance 2 from root.
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

  void printkth(node temp, int k){

    if(temp==null) return;
    if(k==0){
      System.out.println(temp.data);
      return;
    }
    printkth(temp.left, k-1);
    printkth(temp.right, k-1);
  }
}

class ques10{
  public static void main(String[] args) {

    Tree t = new Tree(5);
    t.push(2);
    t.push(3);
    t.push(4);
    t.push(6);

    t.printkth(t.head, 2);
  }
}
