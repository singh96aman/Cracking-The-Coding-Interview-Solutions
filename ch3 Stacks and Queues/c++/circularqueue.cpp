//
//  main.c
//  lab1
//
//  Created by Aman Singh Thakur on 26/09/16.
//  Copyright © 2016 Aman Singh Thakur. All rights reserved.
//

#include <stdio.h>
#include <string.h>
#define m 3

typedef struct
{
    int r, f;
    char a[100][100];
}q;

void push(q *s, char ele[])
{
    if((s->f)==((s->r)+1)%m)
        printf("Overflow");
    else
    {
        s->r=(s->r+1)%m;
        strcpy(s->a[s->r], ele);
    }
}

void pop(q *s)
{
    if((s->r)==-1)
        printf("Underlow");

    if((s->r)==(s->f))
    {
        s->r=-1;
        s->f=-1;
    }
    else
    {
        s->f=((s->f)+1)%m;
    }
}

void display(q s)
{
    int i;
    if(s.r==-1)
        printf("Empty");
    else if(s.f<=s.r)
        for(i=s.f; i<=s.r; i=i+1)
            printf("%s\n",s.a[i]);
    else
    {
        for(i=s.f; i<m; i++)
            printf("%s\n",s.a[i]);
        i=i-m;
        for(; i<=s.r; i++)
            printf("%s\n",s.a[i]);
    }
}


int main(int argc, const char * argv[]) {

    q a;
    a.f=-1;
    a.r=-1;
    int choice;
    char ele[100];
    char c='y';
    while(c=='y')
    {
        printf("1. Push\n2.Pop\n3.Display");
        scanf("%d",&choice);
        switch (choice) {
            case 1:
                scanf("%s",ele);
                push(&a, ele);
                if(a.f==-1)
                    a.f++;
                break;
            case 2:
                pop(&a);
                break;
            case 3:
                display(a);
                break;
        }

        printf("enter : ");
        scanf(" %c",&c);
    }

    return 0;
}
