import java.util.*;
class node{
  int data;
  node left, right;
  node(int d){
    data=d;
    left=null;
    right=null;
  }
}

class Tree{
  node root;
  static LinkedList<Integer>[] list;

  Tree(int d){
    root = new node(d);
  }

  void add(int d){
    node temp = root, parent =root;
    while(temp!=null){
      parent = temp;
      if(temp.data > d)
        temp = temp.left;
      else
        temp = temp.right;
    }
    node newnode = new node(d);
    if(parent.data > d)
      parent.left = newnode;
    else
      parent.right = newnode;
  }

  void output(node n){
    if(n!=null){
      System.out.println(n.data);
      output(n.left);
      output(n.right);
    }
  }

  void getDepth(node n){
    if(n==null)
      return 0;
    if(n.left==null)
      return getDepth(n.right) + 1;
    if(n.right==null)
      return getDepth(n.left) + 1;
    return Math.min((n.right),(n.left)) + 1;
  }

  LinkedList<Integer>[] listOfDepths(){
      Node temp = this.root;
      int h = getDepth(temp);
      list = new LinkedList<Integer>[h];
      for(int i=0; i<h; i++)
      {
        list[i] = new LinkedList<Integer>();
        printGivenLevel(temp,i, list[i]);
      }
  }

  void printGivenLevel(node temp, int i, LinkedList<Integer> list){
    if(temp == null)
      return ;
    if(i == 0)
      list.add(temp.data);
    else{
      printGivenLevel(temp.left, i-1, list);
      printGivenLevel(temp.right, i-1, list);
    }
  }
}
class ques3again{
  public static void main(String[] args) {
    Tree t = new Tree(5);
    t.add(3);
    t.add(6);
    t.add(4);
    t.add(1);t.add(7);
    t.add(2);
    t.output(t.root);
  }
}
