import java.util.*;

class ques9{

/*String checkString(String temp)
{
  char[] arr = temp.toCharArray();
  String newTemp = "";
  for(int i=0; i<arr.length; i++)
    if(arr[i]=='(')
      {newTemp=temp.substring(i+1);
        break;}

  return newTemp;
}*/

String insertInside(String str, int leftIndex){
  String left = str.substring(0,leftIndex+1);
  String right = str.substring(leftIndex+1, str.length());
  return left + "()" + right;
}

ArrayList<String> printParen(int n, ArrayList<String> temp){

  if(n==0)
    temp.add("");
  else{
      ArrayList<String> prev = printParen(n-1, temp);
      for(int j=0; j<prev.size(); j++)
      { String str = prev.get(j);
        //System.out.println(str.length());
      for(int i=0; i<str.length(); i++)
      {
        if(str.charAt(i)=='(')
        {
            String s=insertInside(str,i);
            temp.add(s);
        }
      }
      temp.add("()"+str);
    }
    }
    //System.out.println(temp);
    return temp;
    }

  public static void main(String[] args) {

    ques9 q = new ques9();
    ArrayList<String> temp = new ArrayList<String>();
    temp=q.printParen(3,temp);
    System.out.println(temp);
  }

}
