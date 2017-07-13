#include<stdio.h>

typedef struct{
  int top;
  int ele[5];
}stack;

const int stack_size=5;
int stacknum=0;
/*
void push(stack *s, int n)
{
  if(s->stacknum==0 && s->top==-1)
  {
    s->top=-1; s->stacknum++;
    s->ele[++(s->top)];
  }
  if(s->top%stack_size==0 && s->stacknum!=0)
  {
    s++; s->top=-1; s->stacknum++;
    s->ele[++(s->top)];
  }
  else
    s->ele[++(s->top)];
}

int pop(stack *s)
{
  if(s->top==-1 && s->stacknum==0)
  {printf("Empty Stack!"); return 0;}
  else if(s->top==-1)
  {
    s->stacknum--;
    s--;
    s->top=stack_size-1;
    return s->ele[(s->top)--];
  }
  else
    return s->ele[(s->top)--];
}

void output(stack s[100])
{
  while(s->stacknum>=0 || s[s->stacknum].top!=-1)
  {
    if(s[s->stacknum].top==-1)
    {
      s[s->stacknum].stacknum--; s[s->stacknum].top = stack_size-1;
    }
    else
    {
      printf("%d\n",s[s->stacknum].ele[s[s->stacknum].top]);
      s[s->stacknum].top--;
    }
  }
}
*/

void push(stack s[10], int n)
{
  if(s[stacknum].top==stack_size-1)
  {
    stacknum++;
    s[stacknum].top=-1;
    s[stacknum].ele[++(s[stacknum].top)]=n;
  }
  else
    s[stacknum].ele[++(s[stacknum].top)]=n;
}

void output(stack s[10])
{
  int top=s[stacknum].top;
  int temppos=stacknum;

  while(temppos!=-1)
  {
    for(int i=top; i>-1; i--)
      {
        printf("%d\n",s[temppos].ele[i]);
      }
      temppos--;
      top=stack_size-1;
  }
}

int pop(stack s[10])
{
  if(s[stacknum].top==-1 && stacknum==0)
  { printf("Stack empty!"); return NULL; }
  else if(s[stacknum].top==-1)
  {
    stacknum--; s[stacknum].top=stack_size;
    return s[stacknum].ele[(s[stacknum].top)--];
  }
  else
    return s[stacknum].ele[(s[stacknum].top)--];
}

int main()
{
  stack s[10];
  s[0].top=-1;
  for(int i=0; i<10; i++)
  {
    push(s,i);
  }
  //output(s);
  pop(s);
    pop(s);

      pop(s);
        pop(s);
    pop(s);  pop(s);
      pop(s);
      output(s);
  //printf("%d",s[0].ele[1]);
  //output(s);
  return 0;
}
