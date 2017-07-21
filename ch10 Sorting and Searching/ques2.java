import java.util.*;

// Using comparision

class ques2{

  String sortedString(String temp){
    char[] content = temp.toCharArray();
    Arrays.sort(content);
    return String.valueOf(content);
  }

  String[] groupAnagrams(String[] arr)
  {
    int n=arr.length;
    int i,k=0;
    String[] output = new String[n];
    for(i=0; i<n; i++)
      {
        if(checkUnique(output,sortedString(arr[i]),k))
          output[k]=arr[i];
        k++;
        for(String s : output)
          System.out.println(s);
        System.out.println();
      }

    return output;
  }

  boolean checkUnique(String[] output, String temp, int k){
    for(int i=0; i<=k; i++)
      if(temp.equals(sortedString(output[i])))
        {
          for(int j=k; j>i; j--)
            output[j+1]=output[j];
          output[i+1]=temp;
          return false;
        }
    return true;
  }

  public static void main(String[] args) {

    ques2 q = new ques2();
    String[] temp = new String[]{"aman","singh","nama","thakur","ghnis","maan"};
    temp = q.groupAnagrams(temp);
    for(String s : temp)
      System.out.println(s);
  }
}
