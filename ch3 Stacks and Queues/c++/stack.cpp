# include <stdio.h>

typedef struct
{
  int top;
  int ele[100];
}stack;

const int max = 5;

void push(stack *s, int n)
{
  if(s->top==max)
    printf("Overflow/n");
  else
    s->ele[++(s->top)]=n;
}

int pop(stack *s)
{
  if(s->top==-1)
  {
    printf("Underflow\n");
    return 0;
  }
  else
    return s->ele[(s->top)--];
}

void output(stack s)
{
  while(s.top!=-1)
  {
    printf("%d\n",s.ele[s.top]);
    s.top--;
  }
}

int main()
{
  stack mystack;
  mystack.top=-1;
  for(int i=0; i<5; i++)
    push(&mystack,i);
  output(mystack);
  pop(&mystack);
  pop(&mystack);
  pop(&mystack);
  pop(&mystack);
  pop(&mystack);
  pop(&mystack);
  //printf("%d\n",mystack.top);
  //output(mystack);
  return 0;
}
