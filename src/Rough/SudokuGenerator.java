package Rough;
import java.util.Random;
public class SudokuGenerator {
    private SudokuSolver solver;
    private Random random;

    public SudokuGenerator() {
        solver = new SudokuSolver();
        random = new Random();
    }

    public void generate(SudokuBoard board, int emptyCells) {
        // First, solve the board to fill it
        solver.solve(board);

        // Now, randomly remove numbers to create the puzzle
        for (int i = 0; i < emptyCells; i++) {
            int row = random.nextInt(9);
            int col = random.nextInt(9);
            while (board.isEmpty(row, col)) {
                row = random.nextInt(9);
                col = random.nextInt(9);
            }
            board.set(row, col, 0);
        }
    }
}
