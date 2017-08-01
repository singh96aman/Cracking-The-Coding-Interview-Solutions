import java.util.*;

public class SearchMazeBFS {
    // function to find the shortest path between
    // a given source cell to a destination cell.

    public static final int ROW = 9;
    public static final int COL = 10;
    int[] rowNum = new int[] { -1, 0, 0, 1 };
    int[] colNum = new int[] { 0, -1, 1, 0 };

    // to store matrix cell coordinates
    static class Point {
	public Point(int row, int col) {
	    this.x = row;
	    this.y = col;
	}

	int x;
	int y;
    }

    // An Data Structure for queue used in BFS
    static class QueueNode {
	public QueueNode(Point src, int d) {
	    this.pt = src;
	    this.dist = d;
	}

	Point pt; // The coordinates of a cell
	int dist; // cell's distance of from the source
    }

    boolean isValid(int row, int col) {
	// return true if row number and column number
	// is in range
	return (((row >= 0) && (row < ROW)) && ((col >= 0) && (col < COL)));
    }

    // These arrays are used to get row and column
    // numbers of 4 neighbors of a given cell

    int BFS(int mat[][], Point src, Point dest) {

	// check source and destination cell
	// of the matrix have value 1
	if ((mat[src.x][src.y] == 0) || (mat[dest.x][dest.y] == 0))
	    return Integer.MAX_VALUE;

	boolean[][] visited = new boolean[ROW][COL];

	// Mark the source cell as visited
	visited[src.x][src.y] = true;

	// Create a queue for BFS
	LinkedList<QueueNode> q = new LinkedList<QueueNode>();

	// distance of source cell is 0
	QueueNode s = new QueueNode(src, 0);
	q.add(s); // Enqueue source cell

	// Do a BFS starting from source cell
	while (!q.isEmpty()) {
	    QueueNode curr = q.peek();
	    Point pt = curr.pt;

	    // If we have reached the destination cell,
	    // we are done
	    if (pt.x == dest.x && pt.y == dest.y)
		return curr.dist;

	    // Otherwise dequeue the front cell in the queue
	    // and enqueue its adjacent cells
	    q.poll();

	    for (int i = 0; i < 4; i++) {
		int row = pt.x + rowNum[i];
		int col = pt.y + colNum[i];

		// if adjacent cell is valid, has path and
		// not visited yet, enqueue it.
		if ((isValid(row, col) && mat[row][col] == 1)
			&& !visited[row][col]) {
		    // mark cell as visited and enqueue it
		    visited[row][col] = true;
		    QueueNode adjCell = new QueueNode(new Point(row, col),
			    curr.dist + 1);
		    q.add(adjCell);
		}
	    }
	}

	// return -1 if destination cannot be reached
	return Integer.MAX_VALUE;
    }

    // Driver program to test above function
    public static void main(String[] args) {
	SearchMazeBFS smbfs = new SearchMazeBFS();
	int[][] mat = new int[][] {
    { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
		{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
		{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
		{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
		{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
		{ 1, 0, 1, 1, 0, 1, 0, 1, 0, 0 },
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
		{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
		{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };

	Point source = new SearchMazeBFS.Point(0, 0);
	Point dest = new SearchMazeBFS.Point(3, 4);

	int dist = smbfs.BFS(mat, source, dest);

	if (dist != Integer.MAX_VALUE)
	    System.out.println("Shortest Path is " + dist);
	else
	    System.out.println("Shortest Path doesn't exist");

    }
}
