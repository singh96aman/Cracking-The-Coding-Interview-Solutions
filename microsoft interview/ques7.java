/*
Largest Rectangular Area in a Histogram | Set 2
Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}. The largest possible rectangle possible is 12 (see the below figure, the max area rectangle is highlighted in red)
*/
import java.util.*;
class ques7{

  static void largestRectangularArea(int[] arr){
    Stack<Integer> stack = new Stack<Integer>();
    int i=0;
    int max_area=0, tp=0, area=0;
    while(i<arr.length){
      if(stack.empty() || arr[stack.peek()]<=arr[i] ) // Use && and \\ to be safe !
        stack.push(i++);
      else
        {
          tp = stack.peek();
          stack.pop();
          area = (stack.empty() ? i : i-stack.peek()-1) * arr[tp];
          if(max_area < area)
            max_area = area;
        }
    }

    while(stack.empty()==false){
      tp = stack.peek();
      stack.pop();
      area = arr[tp] * (stack.empty() ? i : i - stack.peek()-1);
      if(max_area<area)
        max_area=area;
    }
    System.out.println(max_area);
  }

  public static void main(String[] args) {
    int[] arr = new int[]{6,2,4,5,1,6};
    largestRectangularArea(arr);
  }
}
