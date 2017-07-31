/*
K’th Largest Element in BST when modification to BST is not allowed
*/
import java.util.*;

class Tree{
  int data;
  Tree left, right;

  Tree(int d){
    data =d;
    left =null;
    right =null;
  }

  void insert(int d){
    Tree temp = this, prev = this;
    while(temp!=null){
      prev = temp;
      if(temp.data>d)
        temp = temp.left;
      else
        temp = temp.right;
    }
    Tree newnode = new Tree(d);
    if(prev.data > d)
      prev.left=newnode;
    else
      prev.right=newnode;
  }
}


class kthlargestinBST{

  static void kthlargest(Tree head, int k){
    int c=0;
    kthlargestUtil(head,k,c);
  }

  static void kthlargestUtil(Tree head, int k, int c){

    if(head==null || c>=k)
      return;

    kthlargestUtil(head.right,k,c);
    c++;

    if(c==k){
      System.out.println(head.data);
      return;
    }

    kthlargestUtil(head.left,k,c);
  }

  public static void main(String[] args) {

  Tree root = new Tree(50);
  root.insert(30);
  root.insert(20);
  root.insert(40);
  root.insert(70);
  root.insert(60);
  root.insert(80);

  for(int k=1; k<=7; k++)
    kthlargest(root,k);
  }
}
