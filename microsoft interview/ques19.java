/*
Boundary Traversal of binary tree
Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise starting from the root.
For example, boundary traversal of the following tree is “20 8 4 10 14 25 22”
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

  void printLeaves(node n){
    if(n!=null){
      printLeaves(n.left);
      if(n.left == null && n.right == null)
        System.out.println(n.data+" ");
      printLeaves(n.right);
    }
  }

  void printBoundaryLeft(node n){
    if(n!=null){
      if(n.left!=null){
        System.out.print(n.data+" ");
        printBoundaryLeft(n.left);
      }
    }
    else if(n.right!=null){
        System.out.print(n.data+" ");
        printBoundaryLeft(n.right);
    }
  }

  void printBoundaryRight(node n){

    if(n!=null){
      if(n.right!=null){
        printBoundaryRight(n.right);
        System.out.print(n.data+" ");
      }
      else if(n.left!=null){
        printBoundaryRight(n.left);
        System.out.print(n.data+" ");
      }
    }
  }

  void printBoundary(node n){
    if(n!=null){
      System.out.print(n.data+" ");
      printBoundaryLeft(n.left);
      printLeaves(n.left);
      printLeaves(n.right);
      printBoundaryRight(n.right);
    }
  }
}

class ques19{

  public static void main(String[] args) {
    Tree t = new Tree(5);
    t.push(3);
    t.push(1);
    t.push(4);
    t.push(6);
    t.push(9);
    t.push(2);
    t.printBoundary(t.head);
  }
}
