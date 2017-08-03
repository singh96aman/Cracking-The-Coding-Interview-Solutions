import java.util.*;

class Tree{
  int data;
  Tree left, right;
  Tree(int d){
    data=d;
    left=null;
    right=null;
  }
  void push(int d){
    Tree temp=this, parent=this;
    while(temp!=null){
      parent=temp;
      if(temp.data>d)
        temp = temp.left;
      else
        temp = temp.right;
    }
    Tree newnode = new Tree(d);
    if(parent.data>d)
      parent.left=newnode;
    else
      parent.right=newnode;
  }
  int sum(Tree temp, int k){
    if(temp==null)
      return 0;
    if(k==0)
      return temp.data;

      return sum(temp.left,k-1)+sum(temp.right,k-1);
  }
  void inorder(Tree temp){
    if(temp!=null){
      inorder(temp.left);
      System.out.println(temp.data);
      inorder(temp.right);
    }
  }
}

class sumatk{
  public static void main(String[] args) {
    Tree t = new Tree(5);
    t.push(3);
    t.push(7);
    t.push(1);
    t.push(2);
    t.push(6);
    t.push(8);
    t.inorder(t);
    System.out.println(t.sum(t,2));
  }
}
