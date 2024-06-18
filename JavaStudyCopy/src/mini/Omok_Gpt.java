package mini;

import java.util.Scanner;

public class Omok_Gpt {
    private static final int SIZE = 15;
    private static final char EMPTY = '.';
    private static final char BLACK = '●';
    private static final char WHITE = '○';

    private char[][] board = new char[SIZE][SIZE];
    private boolean blackTurn = true;

    public static void main(String[] args) {
        Omok_Gpt game = new Omok_Gpt();
        game.play();
    }

    public Omok_Gpt() {
        // 게임 보드를 초기화합니다.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard(); // 현재 보드를 출력합니다.
            if (blackTurn) {
                System.out.println("검돌차례 (X)"); // 검은 돌 차례
            } else {
                System.out.println("흰돌차례 (O)"); // 흰 돌 차례
            }
            System.out.print("x,y 입력 (0-14): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // 유효하지 않은 위치나 이미 돌이 놓인 위치를 검사합니다.
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != EMPTY) {
                System.out.println("다시해라."); // 유효하지 않은 이동
                continue;
            }

            // 현재 턴의 플레이어의 돌을 놓습니다.
            board[row][col] = blackTurn ? BLACK : WHITE;

            // 승리 조건을 검사합니다.
            if (checkWin(row, col)) {
                printBoard(); // 보드를 다시 출력합니다.
                if (blackTurn) {
                    System.out.println("Black (X) wins!"); // 검은 돌 승리
                } else {
                    System.out.println("White (O) wins!"); // 흰 돌 승리
                }
                break;
            }

            // 턴을 바꿉니다.
            blackTurn = !blackTurn;
        }
        scanner.close();
    }

    private void printBoard() {
        // 보드를 출력합니다.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean checkWin(int row, int col) {
        char stone = board[row][col];
        return checkDirection(row, col, stone, 1, 0) || // 수평 방향 검사
               checkDirection(row, col, stone, 0, 1) || // 수직 방향 검사
               checkDirection(row, col, stone, 1, 1) || // 대각선 / 방향 검사
               checkDirection(row, col, stone, 1, -1);  // 대각선 \ 방향 검사
    }

    private boolean checkDirection(int row, int col, char stone, int dRow, int dCol) {
        int count = 0;
        for (int i = -4; i <= 4; i++) {
            int r = row + i * dRow;
            int c = col + i * dCol;
            // 보드 경계 내에 있고 같은 돌이 연속되는지 검사합니다.
            if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c] == stone) {
                count++;
                if (count == 5) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}