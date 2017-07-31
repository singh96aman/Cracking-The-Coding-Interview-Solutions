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

class leftview{

  static int maxlevel=0;

  static void leftViewUtil(Tree root, int level){

    if(root==null)
      return;

    if(maxlevel<level)
    {
      System.out.println(" "+root.data);
      maxlevel=level;
    }

    leftViewUtil(root.left, level+1);
    leftViewUtil(root.right, level+1);
  }

  static void leftView(Tree root){
    leftViewUtil(root,1);
  }

  public static void main(String[] args) {

    Tree root = new Tree(50);
    root.insert(30);
    root.insert(20);
    root.insert(40);
    root.insert(70);
    root.insert(60);
    root.insert(80);
    leftView(root);
  }
}
