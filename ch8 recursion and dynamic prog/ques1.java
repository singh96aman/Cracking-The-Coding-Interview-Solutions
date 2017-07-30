import java.util.*;
class ques1{

  int findAllPossiblePaths(int n)
  {
    if(n==0)
      return 1;
    else if(n<0)
      return 0;

    return findAllPossiblePaths(n-1) + findAllPossiblePaths(n-2) + findAllPossiblePaths(n-3);
  }

  public static void main(String[] args) {

    ques1 q = new ques1();
    System.out.println(q.findAllPossiblePaths(36));
  }

}
