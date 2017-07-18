import java.util.*;

// Point class will indicate a point on the matrix
class Point{
  int row;
  int col;

  Point(int row, int col){
    this.row=row;
    this.col=col;
  }

  int getRow()
  { return row; }

  int getCol()
  { return col; }
}

// Main Class that will has the findPath function and main function
class ShortestPath{

  //findPath function function that calls itself using function overloading
  ArrayList<Point> findPath(boolean[][] maze)
  {
    //for empty maze
    if(maze==null || maze.length ==0)
      return null;

    //path will hold the points of the final shortest distance excluding obstacles
    ArrayList<Point> path = new ArrayList<Point>();

    //Cache to keep all visited points and their status (true,false)
    HashMap<Point, Boolean> cache = new HashMap<Point,Boolean>();

    if(findPath(maze, maze.length-1, maze[0].length-1, path, cache))
      return path;

    return null;
  }

  //Recursive Memorization function
  boolean findPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashMap<Point,Boolean> cache){

    //Out of Bounds !
    if(col<0 || row<0 || !maze[row][col])
      return false;

    Point point = new Point(row, col);

    //Checking for failed points
    if(cache.containsKey(point))
      return cache.get(point);

    boolean isAtOrigin = (row==0) && (col==0);
    boolean success=false;

    //If there exists a path
    if(isAtOrigin || findPath(maze, row, col-1, path, cache) || findPath(maze, row-1, col, path, cache)){
      path.add(point);
      //System.out.println(path);
      success=true;
    }

    cache.put(point,success);
    return success;
  }

  public static void main(String[] args) {

    boolean[][] matrix = new boolean[4][5];
    ShortestPath shortestPath = new ShortestPath();
    ArrayList<Point> point = new ArrayList<Point>();

    //Basic initialization of Array
    for(int i=0; i<4; i++)
      for(int j=0; j<5; j++)
        matrix[i][j]=true;

    //Give Obstacles by assigning them in false
    matrix[1][1]=false;
    matrix[2][1]=false;
    matrix[1][3]=false;
    matrix[3][3]=false;
    matrix[0][4]=false;

    point = shortestPath.findPath(matrix);

    for(int i=0; i<point.size(); i++)
    {
      System.out.print("("+point.get(i).row+","+point.get(i).col+"), ");
    }
  }
}
