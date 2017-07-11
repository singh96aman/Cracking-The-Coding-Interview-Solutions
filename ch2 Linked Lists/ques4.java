import java.util.*;

class Node{
  Node next=null;
  int data;

  Node(int d){
    data = d;
    next = null;
  }
  Node(){}

  Node appendToHead(int d)
  {
    Node temp = new Node(d);
    Node n = this;
    if(n==null)
      return temp;
    temp.next = n;
    return temp;
  }

  void output()
  {
    Node temp = this;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }

}

class ques4
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Node head1 = new Node();
    Node head2 = new Node();
    int d;
    for(int i=0; i<3; i++)
    {
      d = in.nextInt();
      head1=head1.appendToHead(d);
    }
    for(int i=0; i<3; i++)
    {
      d = in.nextInt();
      head2=head2.appendToHead(d);
    }
    //System.out.println();
    head1.output();
    //System.out.println();
    head2.output();
    Node newnode = Sum(head1, head2);
    System.out.println();
    newnode.output();
  }

  static Node Sum(Node head1, Node head2)
  {
    Node newnode = new Node();
    while(head1.next!=null)
    {
      int sum = head1.data + head1.data;
      int carry = sum/10;
      newnode = newnode.appendToHead(sum-carry*10);
      head1 = head1.next;
      head2 = head2.next;
      //System.out.println(sum+" "+carry+" "+(sum-carry*10));
      //newnode.output();
    }
    return newnode;
  }
}
