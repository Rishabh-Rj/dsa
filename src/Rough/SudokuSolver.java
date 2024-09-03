package Rough;

public class SudokuSolver {
    private static final int SIZE = 9;

    public boolean solve(SudokuBoard board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board.isEmpty(row, col)) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValid(board, row, col, num)) {
                            board.set(row, col, num);
                            if (solve(board)) {
                                return true;
                            } else {
                                board.set(row, col, 0); // Backtrack
                            }
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Puzzle solved
    }

    private boolean isValid(SudokuBoard board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board.get(row, i) == num || board.get(i, col) == num ||
                    board.get(row - row % 3 + i / 3, col - col % 3 + i % 3) == num) {
                return false;
            }
        }
        return true;
    }
}
