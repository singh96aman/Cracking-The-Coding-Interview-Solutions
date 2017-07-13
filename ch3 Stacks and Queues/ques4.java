import java.util.*;
class stack{
  int top;
  int ele[];

  stack()
  {
    top=-1;
    ele = new int[10];
  }

  void push(int n)
  {
      if(this.top==5)
        System.out.println("Overflow");
      else
        this.ele[++(this.top)]=n;
  }

  int pop()
  {
    if(this.top==-1)
      { System.out.println("Underflow"); return 0; }
    else
    {
      return this.ele[(this.top)--];
    }
  }
  void output()
  {
    int val = this.top;
    while(val!=-1)
    {
      System.out.println(this.ele[val]);
      val--;
    }
  }
  int peek()
  {
    return this.top;
  }
}

class Myqueue{
  stack s1, s2;

  Myqueue()
  {
      s1 = new stack();
      s2 = new stack();
  }

  void push(int n)
  {
    s1.push(n);
  }

  int pop()
  {
    int val=s1.pop();
    s2.push(val);
    return val;
  }
  void output()
  {
    int up=s1.peek();
    int down=s2.peek()+1;
    for(int i=down; down<=up; down++)
      System.out.println(s1.ele[down]);
  }
}

class ques4
{
  public static void main(String[] args) {
    Myqueue queue = new Myqueue();
    for(int i=0; i<5; i++)
    {
      queue.push(i);
    }
    queue.output();
    queue.pop();
    queue.output();
  }
}
