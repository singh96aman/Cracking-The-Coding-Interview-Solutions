import java.util.*;

class node
{
  int data;
  node left;
  node right;

  node(int d)
  {
    data=d;
    left=null;
    right=null;
  }
}

class Tree
{
 node root;

 Tree(int d)
 { root = new node(d); }

 node createMinimalTree(int arr[], int start, int end)
 {
   if(end<start)
    return null;

    int mid = (end+start)/2;
    node newroot = new node(arr[mid]);
    newroot.left = createMinimalTree(arr,start,mid-1);
    newroot.right = createMinimalTree(arr, mid+1, end);
    return newroot;
  }

  void createMinimalTree(int arr[])
  {
    root = createMinimalTree(arr,0, arr.length-1);
  }

 void outputinorder(node n)
 {
   if(n!=null)
   {
     System.out.println(n.data);
     outputinorder(n.left);
     outputinorder(n.right);
   }
 }
}

class minimaltree
{
  public static void main(String[] args) {

    Tree t = new Tree(0);
    int arr[]={1,2,3,4,5};
    t.createMinimalTree(arr);
    t.outputinorder(t.root);
  }
}
