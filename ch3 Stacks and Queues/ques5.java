import java.util.*;
class stack{
  int top;
  int ele[];

  stack()
  {
    top=-1;
    ele = new int[20];
  }

  void push(int n)
  {
      if(this.top==5)
        System.out.println("Overflow");
      else
        {
          int min = n, temp;
          int top = 0;
          if(top==-1)
            this.ele[++(this.top)]=min;
          else
          {
          while(top!=5)
          {
            if(min>this.ele[top])
            {
              for(int i=this.top+1; i>top; i--)
              {
                this.ele[i]=this.ele[i-1];
              }
              this.ele[top]=min;
              this.top++;
              //System.out.println(this.ele[top]);
              this.output();
              System.out.println();
              break;
            }
            top++;
          }
        }
        }

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

class ques5{
  public static void main(String[] args) {

    stack s = new stack();
    //for(int i=0; i<8; i++)
      //s.push(i);
    s.push(2);
    s.push(4);
    s.push(3);
    s.push(1);
    s.output();

  }
}
