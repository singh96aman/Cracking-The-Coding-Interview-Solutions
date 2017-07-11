import java.util.*;

class Node{
  Node next;
  int data;

  Node(int d){
    data = d;
    next = null;
  }

  void insert(Node head, int d)
  {
    if(head.next==null)
      {
        Node temp = new Node(d);
        head.next = temp;
      }
    else
      insert(head.next,d);
  }

  void output()
  {
    Node n = this;
    while(n!=null)
    {
      System.out.println(n.data);
      n=n.next;
    }
  }
}

class linkedrecur
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    for(int i=0; i<4; i++)
    {
      d = in.nextInt();
      head.insert(head,d);
    }
    head.output();
  }
}
