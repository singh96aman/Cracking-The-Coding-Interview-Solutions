import java.util.*;

class Node{
  Node next;
  int data;

  Node(int d){
    data = d;
    next = null;
  }
  Node(){
    //data =0;
    Node n =this;
    n =null;
  }

  void appendToTail(int d)
  {
    Node temp = new Node(d);
    Node n = this;
    while(n.next!=null)
    {
      n = n.next;
    }
    n.next= temp;
    temp.next=null;
  }

  void output()
  {
    Node temp = this;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  void del()
  {
    Node head=this;
    Node fast=head, slow=head;
    Node prev=null;
    while(fast.next!=null)
    {
        prev=slow;
        slow=slow.next;
        fast=fast.next;
        if(fast.next!=null)
          fast=fast.next;
        //System.out.println(slow.data+" "+fast.data);
    }
    prev.next = slow.next;
  }
}

class ques3
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    for(int i=0; i<3; i++)
    {
      d = in.nextInt();
      head.appendToTail(d);
    }
    System.out.println();
    //head.output();
    head.del();
    head.output();
    //System.out.println();
    //head.output();
    //del(head);
    //System.out.println();
    //head.output();
  }
}
