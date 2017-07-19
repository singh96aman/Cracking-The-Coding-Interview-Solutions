import java.util.*;
class ques12{

  int Grid_Size = 8;

  void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results){
    if(row==Grid_Size)
      results.add(columns.clone());
    else{
      for(int col=0; col < Grid_Size; col++){
        if(checkValid(columns,row,col)){
          columns[row] = col;
          placeQueens(row+1, columns, results);
        }
      }
    }
  }

  boolean checkValid(Integer[] columns, int row1, int column1){
    for(int row2=0; row2<row1; row2++){
      int column2 = columns[row2];

      if(column1==column2)
        return false;

      //Check for diagonal
      int columnDistance = Math.abs(column2-column1);
      int rowDistance = row1-row2;
      if(columnDistance == rowDistance)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {

    ques12 q = new ques12();
    Integer[] col = new Integer[]{0,0,0,0,0,0,0,0};
    ArrayList<Integer[]> results = new ArrayList<Integer[]>();
    q.placeQueens(0,col,results);
    for(int i=0; i<results.size(); i++){
      for(int j=0; j<(results.get(i)).length; j++)
        System.out.print((results.get(i))[j]);
      System.out.println();
      }
  }
}

// AWESOME WRITE :)
