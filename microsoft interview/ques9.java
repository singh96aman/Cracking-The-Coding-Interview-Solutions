/*
Write an Efficient Function to Convert a Binary Tree into its Mirror Tree
Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.
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

  void mirror(node temp){
    if(temp == null)
      return;
    else{
      node temp2;
      mirror(temp.left);
      mirror(temp.right);
      temp2 = temp.left;
      temp.left = temp.right;
      temp.right = temp2;
    }
  }
}

class ques9{
  public static void main(String[] args) {

    Tree t = new Tree(5);
    t.push(2);
    t.push(3);
    t.push(4);
    t.push(6);
    //System.out.println(t.head.left.left.data);
    t.output(t.head);
    t.mirror(t.head);
    t.output(t.head);

  }
}
