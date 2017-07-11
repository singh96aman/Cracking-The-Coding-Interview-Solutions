class permute
{
  public static void main(String[] args) {
    String str = "ABC";
    int n = str.length();
    permute(str, 0, n-1);
  }

  static void permute(String str, int l, int r)
  {
    if(l==r)
      System.out.println(str);
    else
    {
      for(int i=l; i<=r; i++)
      {
        str = swap(str, l, i);
        permute(str, l+1, r);
        str = swap(str, l, i);
      }
    }
  }

  static String swap(String str, int l, int r)
  {
    char temp;
    char[] charArray = str.toCharArray();
    temp = charArray[l];
    charArray[l]=charArray[r];
    charArray[r]=temp;
    return String.valueOf(charArray);
  }

}
