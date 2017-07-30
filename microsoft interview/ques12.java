/*
Write Code to Determine if Two Trees are Identical
Two trees are identical when they have same data and arrangement of data is also same.

To identify if two trees are identical, we need to traverse both trees simultaneously,
and while traversing we need to compare data and children of the trees.
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

  boolean identicalTrees(node temp1, node temp2){

    if(temp1!=null && temp2!=null)
      return true;

    if(temp1!=null && temp2!=null)
      return (temp1.data == temp2.data
              && identicalTrees(temp1.left,temp2.left)
              && identicalTrees(temp1.right,temp2.right));

    return false;
  }
}
