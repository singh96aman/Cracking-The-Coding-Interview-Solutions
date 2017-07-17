import java.util.*;
class BitManipulation
{
  int num;
  ArrayList<Integer> seq;
  ArrayList<Integer> seqarr;

  BitManipulation(int n)
  { num=n;
    seq = new ArrayList<Integer>();
    seqarr = new ArrayList<Integer>();}

  void output()
  {
    int n = num;
    while(n!=0){
      System.out.print(n%2+" ");
      n=n/2;
    }
    System.out.println();
  }

  int getBit(int i){
    if(((num & (1<<i))!=0))
      return 1;
    else
    return 0;
  }

  void setBit(int i){
    num |= (1<<i);
  }

  void clearBit(int i){
    int mask = ~(1<<i);
    num &= mask;
  }

  void updateBit(int i, int val){
    int mask = ~ (1<<i);
    num = (num & mask) | (val<<i);
  }

  void nextNumber()
  {
    int n=num;
    ArrayList<Integer> seq = new ArrayList<Integer>();
    while(n>0)
    {
      seq.add(n%2);
      n>>=1;
    }

    for(int i=seq.size()-1; i>0; i--)
    {
      if(seq.get(i)==1 && seq.get(i-1)==0)
      {
          setBit(i-1);
          clearBit(i);
          break;
      }
    }
    //System.out.println(num);
  }
}

class ques4{
  public static void main(String[] args) {
    BitManipulation bit = new BitManipulation(1755);
    bit.output();
    bit.nextNumber();
    bit.output();
  }
}
