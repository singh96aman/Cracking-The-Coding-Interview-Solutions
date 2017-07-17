class BitManipulation
{
  int num;
  BitManipulation(int n)
  { num=n; }

  void output()
  {
    int n = num;
    while(n!=0){
      System.out.print(n%2+" ");
      n=n/2;
    }
    System.out.println();
  }

  boolean getBit(int i){
    return ((num & (1<<i))!=0);
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

  public static void main(String[] args) {
    int num = 1;
    BitManipulation bit = new BitManipulation(num);
    bit.output();
    if(bit.getBit(2)==true)
      System.out.println("1");
    else
      System.out.println("0");
    bit.setBit(2);
    bit.output();
    bit.clearBit(2);
    bit.output();
    bit.updateBit(3,0);
    bit.output();
  }
}
