// For those of who want to program in binary and get in array aligned and human readable

class ques10
{
  /*
  int strip[][];
  ques10()
  {
    strip = new int[10];
    for(int i=0; i<10; i++)
      strip[i] = new int();
  }*/


  void getBinary(int n, int bin[])
  {
      bin = new int[10];
      int lim=0, i=0;
      while(Math.pow(2,lim)<n)
        lim++;
      //for(i=9; i>=0; i--)
      //  System.out.print(bin[i]);
      //  System.out.println();
      for(i=9; i>lim; i--)
        bin[i]=0;
      //  for(i=9; i>=0; i--)
      //    System.out.print(bin[i]);
      //  System.out.println();
      int j=0;
      while(n>0)
      { bin[j]=n%2;
        n>>=1;
        j++;}
      //System.out.println(i);
      //  for(i=9; i>=0; i--)
      //    System.out.print(bin[i]);
      //  System.out.println();
      while(i>j)
      {
        bin[i]=0;
        i--;
      }
      for(i=9; i>=0; i--)
        System.out.print(bin[i]);
  }

  public static void main(String[] args) {

    ques10 q = new ques10();
    int bin[]= new int[10];
    q.getBinary(57,bin);

    // Now assign strip values and check

  }
}
