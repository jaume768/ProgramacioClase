import java.util.Timer;
import java.util.TimerTask;
import java.io.IOException;
import static java.time.zone.ZoneRulesProvider.refresh;


public class main {

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 1, 0, 0, 0, 0, 0,1,0,1,0,0,0,0},
                {0, 0, 0, 1, 1, 0, 0, 0,0,1,1,0,0,0,0},
                {0, 0, 0, 1, 0, 1, 0, 0,0,0,0,1,0,0,0},
                {0, 0, 0, 0, 1, 0, 0, 0,0,0,0,0,0,0,0},
                {0, 0, 0, 1, 0, 0, 0, 0,0,0,1,1,0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0,0,0,0,1,0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0,0,0,1,0,0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 1,1,0,0,0,0,0,0}
        };

        int iterations = 15;

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 0;

            public void run() {
                if (i < iterations) {
                    play(board,i);
                    printBoard(board);
                    clearScreen();
                    i++;
                } else {
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }

    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 1) {
                    System.out.print("\u001B[47m\u001B[30m " + cell + " \u001B[0m");
                } else {
                    System.out.print("\u001B[40m\u001B[37m " + cell + " \u001B[0m");
                }
            }
            System.out.println();
        }
    }

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void play(int[][] board, int iterations) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < iterations; i++) {
            int[][] newBoard = new int[rows][cols];

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int neighbors = countNeighbors(board, rows, cols, row, col);
                    int currentState = board[row][col];
                    int newState = 0;

                    if (currentState == 1 && (neighbors == 2 || neighbors == 3)) {
                        newState = 1;
                    } else if (currentState == 0 && neighbors == 3) {
                        newState = 1;
                    }

                    newBoard[row][col] = newState;
                }
            }

            board = newBoard;
        }
    }

    private static int countNeighbors(int[][] board, int rows, int cols, int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                int neighborRow = row + i;
                int neighborCol = col + j;

                if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < cols) {
                    count += board[neighborRow][neighborCol];
                }
            }
        }

        return count;
    }
}