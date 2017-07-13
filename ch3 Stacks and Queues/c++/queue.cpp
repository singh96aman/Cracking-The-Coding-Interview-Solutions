#include <stdio.h>

typedef struct{
  int r, f;
  int ele[100];
}queue;

const int max = 5;

void push(queue *s, int n)
{
  if(s->f==max)
    printf("Overflow\n");
  else
    s->ele[++(s->f)]=n;
}

int pop(queue *s)
{
  if(s->r==max){
    printf("Underflow");
    return 0; }
  else
    return s->ele[++(s->r)];;
}

void output(queue s)
{
  if(s.r==s.f)
    printf("Empty Queue!");
  else
  {
    for(int i=(s.r)+1; i<s.f; i++)
      printf("%d\n",s.ele[i]);
  }
}

int main()
{
  queue q;
  for(int i=0; i<5; i++)
  {
    push(&q,i+1);
  }
  output(q);
  for(int i=0; i<6; i++)
  {
    pop(&q);
    printf("\n");
    output(q);
  }
  return 0;
}
