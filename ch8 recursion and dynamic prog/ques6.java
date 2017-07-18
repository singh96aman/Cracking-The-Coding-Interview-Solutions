import java.util.*;
class ques6{
  void towerOfHanoi(int n, char source, char intermediate, char destination){
      if(n==1){
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        return;
      }
      towerOfHanoi(n-1,source, destination,intermediate);
      System.out.println("Move disk "+n+" from "+intermediate+" to "+destination);
      towerOfHanoi(n-1,intermediate,source,destination);
  }
  public static void main(String[] args) {

    ques6 q = new ques6();
    int n=10;
    char[] a = new char[]{'A','B','C'};
    q.towerOfHanoi(n,a[0],a[1],a[2]);
  }
}
