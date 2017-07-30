/*
Merge two sorted linked lists
Write a SortedMerge() function that takes two lists, each of which is sorted in increasing order, and merges the two together into one list which is in increasing order. SortedMerge() should return the new list. The new list should be made by splicing
together the nodes of the first two lists.
*/
import java.util.*;

class Node{
  int data;
  Node next;
  Node(int d){
    data = d;
    next = null;
  }
  void appendToTail(int d){
    Node temp = this;
    while(temp.next!=null)
      temp = temp.next;
    Node newnode = new Node(d);
      temp.next = newnode;
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
class merge2list{

  static Node merge(Node head1, Node head2){

    int min = head1.data<head2.data?head1.data:head2.data;
    if(min==head1.data)
      head1 = head1.next;
    else
      head2 = head2.next;

    Node head3 = new Node(min);

    while(head1!=null && head2!=null){
      if(head1.data<head2.data)
      {
        head3.appendToTail(head1.data);
        head1 = head1.next;
      }
      else
      {
        head3.appendToTail(head2.data);
        head2 = head2.next;
      }
    }

    if(head2==null)
    {
      Node temp = head3;
      while(temp.next!=null)
        temp = temp.next;
      temp.next=head1;
    }
    else{
      Node temp = head3;
      while(temp.next!=null)
        temp = temp.next;
      temp.next=head2;
    }
    return head3;
  }

  public static void main(String[] args) {
     Node head1 = new Node(4);
     head1.appendToTail(5);
     head1.appendToTail(7);
     head1.appendToTail(9);
     head1.appendToTail(13);
     head1.appendToTail(15);
     head1.appendToTail(18);

     Node head2 = new Node(1);
     head2.appendToTail(3);
     head2.appendToTail(6);
     head2.appendToTail(8);
     head2.appendToTail(10);

     Node head3 = merge(head1, head2);
     head3.output();
  }
}
