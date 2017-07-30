import java.util.*;

class NGE{

  static void findNGE(int[] arr){
    Stack<Integer> s = new Stack<Integer>();
    s.push(arr[0]);
    int element, next=0;
    for(int i=1; i<arr.length; i++){
      next = arr[i];
      if(!s.isEmpty()){
        element = s.pop();
        while(element<next){
          System.out.println(element+" "+next);
          if(s.isEmpty())
            break;
          element=s.pop();
        }
        if(element>next)
          s.push(element);
      }
      s.push(next);
    }
    while(!s.isEmpty()){
      element = s.pop();
      next =-1;
      System.out.println(element+" "+next);
    }
  }

  public static void main(String[] args) {

    int[] arr = new int[]{12,-8,-3,2,56,2,21};
    findNGE(arr);

  }
}
