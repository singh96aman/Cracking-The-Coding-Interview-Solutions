/*
Reverse a linked list
Given pointer to the head node of a linked list, the task is to reverse the linked list.
*/
import java.util.*;

class node{
  int data;
  node next;

  node(int d){
    data=d;
    next=null;
  }

  void push(int d){
    node temp = this;
    while(temp.next!=null)
      temp = temp.next;
    node newnode = new node(d);
    temp.next = newnode;
  }

  node reverse(){
    node current=this, prev=null, next=null;
    while(current!=null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }
  void output()
  {
    node temp = this;
    while(temp!=null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
class ques13{
  public static void main(String[] args) {

    node head = new node(0);
    for(int i=1; i<4; i++)
      head.push(i);
    head.output();
    head = head.reverse();
    head.output();
  }
}
