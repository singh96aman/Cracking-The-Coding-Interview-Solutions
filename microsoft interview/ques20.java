// Java program to convert a tree into its sum tree
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

  int toSumTree(node n){
    if(n==null)
      return 0;

    int old_val = n.data;

    n.data = toSumTree(n.left) + toSumTree(n.right);

    return n.data + old_val;
  }
}
