import java.util.*;

class linkedlist
{
  int timestamp;
  linkedlist next;

  linkedlist(int data)
  {
    timestamp=data;
    next=null;
  }
  linkedlist()
  {}

  void push(int data)
  {
    linkedlist newnode = new linkedlist(data);
    linkedlist temp = this;
    while(temp.next!=null)
      temp=temp.next;
    temp.next=newnode;
  }

  linkedlist pop()
  {
    if(this==null)
      {System.out.println("Empty list"); return null;}
    else{
      System.out.println(this.timestamp+" removed !");
      return this.next;
    }
  }

  void output()
  {
    linkedlist temp = this;
    while(temp!=null)
    {
      System.out.println(temp.timestamp);
      temp=temp.next;
    }
  }
  int peek()
  {
    return this.timestamp;
  }
}

// 1 is dog and 2 is cat

class Animal{
  linkedlist dog, cat;

  Animal()
  {
    dog = new linkedlist();
    cat = new linkedlist();
  }

  void push(int ch, int time)
  {
    if(ch==1)
      dog.push(time);
    else
      cat.push(time);
  }

  // Complete the rest

}

class ques6
{
  public static void main(String[] args) {

    linkedlist node = new linkedlist(5);
    node.push(2);
    node.output();
    node = node.pop();
    node.output();

  }
}
