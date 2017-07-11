import java.util.*;

class solution{
  public static void main(String[] args) {

    int n=1000;
    double result;

    Map<Integer,Double> map = new HashMap<Integer,Double>();

    for(int c=0; c<n; c++)
    {
      for(int d=0; d<n; d++)
      {
        result = Math.pow(c,3) + Math.pow(d,3);
        map.put(c,result);
      }
    }

    for(int a=0; a<n; a++)
    {
      for(int b=0; b<n; b++)
      {
        result  = Math.pow(a,3) + Math.pow(b,3);
        if(map.get(result)!=null)
          System.out.println(map.get(result));
      }
    }

  }
}
