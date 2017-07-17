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

  void findLongestSequence()
  {
    int n = num;
    while(n!=0){
      seq.add(n%2);
      n=n/2;
  }

  //ArrayList<Integer>[] seqarr = ArrayList<Integer>[10];
  int longest=0;
  int lastbit;
  int counter=0;

  //seqarr[0] = ArrayList<Integer>();
  lastbit=getBit(0);
  longest=0;

  for(int i=0; i<seq.size(); i++)
  {
      int newBit = getBit(i);

      if(newBit==1)
        longest++;
      else{
        counter++;
        //seqarr[counter][0].add(newBit);
        seqarr.add(longest);
        longest=0;
      }
  }
  seqarr.add(longest);
  int max = seqarr.get(0) + seqarr.get(1);
  for(int i=0; i<seqarr.size()-1; i++)
    if(max<(seqarr.get(i)+seqarr.get(i+1)))
      max = seqarr.get(i)+seqarr.get(i+1);
  System.out.println(max+1);
}
}

class ques3{
  public static void main(String[] args) {
    BitManipulation bit = new BitManipulation(1775);
    bit.output();
    bit.findLongestSequence();
  }
}
