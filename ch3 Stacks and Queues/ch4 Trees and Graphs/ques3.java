import java.util.*;

class Node{
  int data;
  Node left, right;

  Node()
  {}

  Node(int d)
  {
      data = d;
      left = null;
      right = null;
  }
}
class Linked
{
  Integer data;
  Linked next;
  Linked()
  {}
  Linked(int d)
  { data = d;
  next = null; }
  Linked add(int d)
  {
    Linked newNode = new Linked(d);
    Linked temp = this;
    newNode.next=temp;
    return newNode;
  }
}

class Tree{
  Node root;
  int noOfNodes;
  static Linked[] listOfDepth;

  Tree()
  {
    root = new Node();
    noOfNodes=0;
  }

  Tree(int d)
  { root = new Node(d);
    noOfNodes=1;}

  void add(int d)
  {
    Node temp=root, parent=root;
    Node newNode = new Node(d);
    if(temp==null)
      root=newNode;
      else{
    while(temp!=null)
    {
      parent = temp;
      if(temp.data > d)
        temp = temp.left;
      else
        temp = temp.right;
    }
    if(parent.data > d)
      parent.left = newNode;
    else
    parent.right = newNode;
  }
    noOfNodes++;
  }

  int depth(Node n)
  {
      if(n==null)
        return 0;
      if(n.left==null && n.right==null)
        return 1;
      if(n.left==null)
        return depth(n.right)+1;
      if(n.right==null)
        return depth(n.left)+1;
      return Math.min(depth(n.left),depth(n.right))+1;
  }

  void printLevelOrder()
    {
        Node temp=this.root;
        int h = depth(temp);
        listOfDepth = new Linked[h];
        int i;
        for (i=0; i<h; i++)
        {
            listOfDepth[i] = new Linked();
            printGivenLevel(temp, i);
            //output(listOfDepth[i]);
        }
    }
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 0)
            {
              listOfDepth[level]=listOfDepth[level].add(root.data);
              //listOfDepth[level].output();
              //System.out.print(root.data + " ");
            }

        else if (level > 0)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
        //System.out.println(listOfDepth[level]);
    }

    void output(Linked temp)
    {
      //Linked temp = this;
      while(temp!=null)
      {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      System.out.println();
    }
}

class ques3
{
  public static void main(String[] args) {

    Tree t = new Tree();
    for(int i=0; i<5; i++)
      t.add(i);
      //System.out.println(t.root.left.data);
    t.printLevelOrder();
    for(int i=0; i<3; i++)
      t.output(t.listOfDepth[i]);
  }
}
