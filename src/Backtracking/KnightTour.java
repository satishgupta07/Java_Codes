package Backtracking;

public class KnightTour {
    public static void main(String[] args) {
        int[][] visited =   {{0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 },
                             {0,0,0,0,0,0,0,0 }};
        visited[0][0] = 1;
        knightTour(visited, 0, 0, 1);

    }

    static int[] pathRow1 = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] pathCol1 = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static boolean knightTour(int[][] visited, int row, int col, int move) {
        if (move == 64) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(visited[i][j]+",");
                }
                System.out.println();
            }
            return true;
        }
        else {
            for (int index = 0; index < pathRow1.length; index++) {
                int rowNew = row + pathRow1[index];
                int colNew = col + pathCol1[index];
                if (ifValidMove(visited, rowNew, colNew)) {
                    move++;
                    visited[rowNew][colNew] = move;
                    if (knightTour(visited, rowNew, colNew, move)) {
                        return true;
                    }
                    move--;
                    visited[rowNew][colNew] = 0;
                }
            }
        }
        return false;
    }

    static boolean ifValidMove(int[][] visited, int rowNew, int colNew) {
        if (rowNew >= 0 && rowNew < 8 && colNew >= 0 && colNew < 8 && visited[rowNew][colNew] == 0){
            return true;
        }
        return false;
    }
}
