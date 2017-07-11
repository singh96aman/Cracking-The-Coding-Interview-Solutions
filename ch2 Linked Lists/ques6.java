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
}

class ques6
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    for(int i=0; i<5; i++)
    {
        d = in.nextInt();
        head.appendToTail(d);
    }
    //head.output();
    if(isPalindrome(head))
      System.out.println("Palindrome");
    else
      System.out.println("Not a Palindrome");
  }

  static boolean isPalindrome(Node head)
  {
    Node fast=head, slow=head;
    int[] stack = new int[100];
    int i=0;
    while(fast!=null && fast.next!=null)
    {
      stack[i] = slow.data;
      i++;
      slow = slow.next;
      fast =  fast.next;
      //if(fast.next!=null)
        fast=fast.next;
    }
    if(fast!=null)
      slow = slow.next;
    while(slow.next!=null)
    {
      i--;
      if(stack[i]!=slow.data)
        return false;
      slow = slow.next;
    }
    return true;
  }
}
