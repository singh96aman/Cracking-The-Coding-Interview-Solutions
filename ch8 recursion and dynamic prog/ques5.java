// This is the question you are searching for !!!

import java.util.*;

class ques5{

  int getMinProducts(int a, int b){
    int smaller = a < b ? a : b;
    int larger = a < b ? b : a;
    return minProducts(smaller, larger);
  }

  int minProducts(int smaller, int larger){
    if(smaller==0)
      return 0;
    else if(smaller==1)
      return larger;

    int val = minProducts(smaller/2,larger);

    if(smaller%2==0)
      return val+val;
    else
      return val+val+larger;
  }

  public static void main(String[] args) {

    ques5 q = new ques5();
    System.out.println(q.getMinProducts(5,6));

  }
}
