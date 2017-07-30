/*
Converting Decimal Number lying between 1 to 3999 to Roman Numerals
Given a number, find its corresponding Roman numeral.
*/
import java.util.*;
class ques15{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String temp="";
    String[] roman = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    //System.out.println("debug1");
    while(n!=0){
        //System.out.println("debug1");
      if(n>=1000){
          temp+=roman[12];
          n-=1000;
      }
      else if(n>=900){
        temp+=roman[11];
        n-=900;
      }
      else if(n>=500){
        temp+=roman[10];
        n-=500;
      }
      else if(n>=400){
        temp+=roman[9];
        n-=400;
      }
      else if(n>=100){
        temp+=roman[8];
        n-=100;
      }
      else if(n>=90){
        temp+=roman[7];
        n-=90;
      }
      else if(n>=50){
        temp+=roman[6];
        n-=50;
      }
      else if(n>=40){
        temp+=roman[5];
        n-=40;
      }
      else if(n>=10){
        temp+=roman[4];
        n-=10;
      }
      else if(n>=9){
        temp+=roman[3];
        n-=9;
      }
      else if(n>=5){
        temp+=roman[2];
        n-=5;
      }
      else if(n>=4){
        temp+=roman[1];
        n-=4;
      }
      else if(n>=1){
        temp+=roman[0];
        n-=1;
      }
    }
    System.out.println(temp);
  }
}
