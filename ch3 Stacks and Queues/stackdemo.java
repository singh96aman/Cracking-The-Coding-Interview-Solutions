import java.util.*;

class Stack<T>
{
  public class StackNode<T>{
    private T data;
    private StackNode<T> next;

    public StackNode(T item){
      data =item;
      next=null;
    }
  }

  private StackNode<T> top;

  public T pop(){
    if(top==null)
      System.out.println("The Stack is empty");
    else
    {
      T item = top.data;
      top = top.next;
      return item;
    }
    return null;
  }

  public void push(T item){
    StackNode<T> temp = new StackNode(item);
      temp.next=top;
      top=temp;
    }

  public T peek(){
    return top.data;
   }
 }


class stackdemo{
  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<Integer>();
    Scanner in = new Scanner(System.in);
    int d;
    for(int i=0; i<5; i++)
    {
        d = in.nextInt();
        stack.push(d);
    }
    for(int i=0; i<5; i++)
    {
      d = stack.pop();
      System.out.println(d);
    }
  }

}
