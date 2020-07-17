package Backtracking;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze =  {{1,1,0,1 },
                         {0,1,1,1 },
                         {0,1,0,1 },
                         {0,1,1,1 } };
        int[][] visited =   {{0,0,0,0 },
                             {0,0,0,0 },
                             {0,0,0,0 },
                             {0,0,0,0 }};

        visited[0][0] = 1;
        findPathInMaze(maze, visited, 0, 0, 3, 3, 1);
    }

    static int[] path_Row = { 0, 0, 1, -1 };
    static int[] path_Col = { 1, -1, 0, 0 };
    public static void findPathInMaze(int[][] maze, int[][] visited, int row, int col, int desRow, int desCol, int move)
    {
        if ((row == desRow) && (col == desCol))
        {
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    System.out.print(visited[i][j] +",");
                }
                System.out.println();
            }
            System.out.println("//////////////////////////////////////////////////");
        }
        else
        {
            for (int index = 0; index < path_Row.length; index++)
            {
                int rowNew = row + path_Row[index];
                int colNew = col + path_Col[index];
                if (canWeMove(maze, visited, rowNew, colNew)) {
                    move++;
                    visited[rowNew][colNew] = move;
                    findPathInMaze(maze, visited, rowNew, colNew, desRow, desCol, move);
                    move--;
                    visited[rowNew][colNew] = 0;
                }
            }
        }
    }
    static boolean canWeMove(int[][] maze, int[][] visited, int rowNew, int colNew)
    {
        if (rowNew >= 0 && rowNew < 4 && colNew >= 0 && colNew < 4 && maze[rowNew][colNew] == 1 && visited[rowNew][colNew] == 0) {
            return true;
        }
        return false;
    }
}
