import java.util.*;
import java.io.*;

class Node{
  char data;
  Node next;
  Node(char d){
    data = d;
    next = null;
  }
  Node(){}

  Node appendToTail(char d){
    Node newnode = new Node(d);
    Node temp = this;
    if(this==null)
      return newnode;
    while(temp.next!=null)
      temp = temp.next;
    temp.next = newnode;
    return this;
  }
  void output(){
    Node temp = this;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  boolean checkPalind(){
    Node fast=this, slow=this;
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

class palindrome{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node node = new Node();
    for(int i=0; i<n; i++)
    {
      char a = sc.next().charAt(0);
      node = node.appendToTail(a);
    }
    node.output();
    if(node.checkPalind())
      System.out.println("Palindrome");
    else
      System.out.println("Not a palindrome");
  }
}
