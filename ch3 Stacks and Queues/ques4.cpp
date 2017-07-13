#include <iostream>

const int max = 5;

class stack
{
  public:
  int top;
  int ele[5];

  stack(int initTop)
  { top=initTop; }

  void push(int n)
  {
    if(this->top==max)
      std::cout<<"Overflow";
    else
      this->ele[++(this->top)]=n;
  }

  int pop(stack s)
  {
    if(this->top==max)
    { std::cout<<"Underflow!"; return NULL; }
    else
    {
      int top = s.top;
      while(top!=this->top)
        top--;
      int val = s.ele[top];
      this->push(val);
      return val;
    }
  }

  void output()
  {
    int pos=this->top;
    while(pos!=-1)
    { std::cout<<this->ele[pos]<<" ";
      pos--;
    }
    std::cout<<"\n";
  }

};

class MyQueue: public stack
{
  public:
  stack s1;
  stack s2;

  MyQueue()
  {

  }

  void pushnumber(int n)
  { s1.push(n); }
  int pop()
  { return s2.pop(); }
  void output()
  {
    std::cout<<"Contents of Queue\n";
    int up=s1.top;
    int down=s2.top;
    while(down<=up)
    {
        std::cout<<s1.ele[down]<<" ";
        down++;
    }
    std::cout<<"\n Contents of Stack 1";
    s1.output();
    std::cout<<"\n Contents of Stack 2";
    s2.output();
  }
}

int main()
{
  return 0;
}

 // Error
 /*
 ques4.cpp:25:39: warning: implicit conversion of NULL constant to 'int' [-Wnull-conversion]
    { std::cout<<"Underflow!"; return NULL; }
                               ~~~~~~ ^~~~
                                      0
ques4.cpp:55:3: error: constructor for 'MyQueue' must explicitly initialize the base class 'stack' which
      does not have a default constructor
  MyQueue()
  ^
ques4.cpp:5:7: note: 'stack' declared here
class stack
      ^
ques4.cpp:55:3: error: constructor for 'MyQueue' must explicitly initialize the member 's1' which does not
      have a default constructor
  MyQueue()

  ques4.cpp:52:9: note: member is declared here
  stack s1;
        ^
ques4.cpp:5:7: note: 'stack' declared here
class stack
      ^
ques4.cpp:55:3: error: constructor for 'MyQueue' must explicitly initialize the member 's2' which does not
      have a default constructor
  MyQueue()
  ^
ques4.cpp:53:9: note: member is declared here
  stack s2;
        ^
ques4.cpp:5:7: note: 'stack' declared here
class stack

ques4.cpp:57:5: error: type 'stack' does not provide a call operator
    s1(-1); s2(0);
    ^~
ques4.cpp:57:13: error: type 'stack' does not provide a call operator
    s1(-1); s2(0);
            ^~
ques4.cpp:63:19: error: too few arguments to function call, single argument 's' was not specified
  { return s2.pop(); }
           ~~~~~~ ^
ques4.cpp:22:3: note: 'pop' declared here
  int pop(stack s)
  ^
ques4.cpp:79:2: error: expected ';' after class
}

;
1 warning and 7 errors generated.
*/
