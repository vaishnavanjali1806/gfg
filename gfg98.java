import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    private final int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    private ArrayList<ArrayList<Integer>> board;
    private int n;

    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        this.n = n;
        board = new ArrayList<>();

        // Initialize board with -1
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(-1);
            }
            board.add(row);
        }

        // Start knight from (0,0)
        board.get(0).set(0, 0);

        // Solve using backtracking + Warnsdorff ordering
        if (solve(0, 0, 1)) {
            return board;
        }

        // If no solution, return empty list
        return new ArrayList<>();
    }

    private boolean isSafe(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < n && board.get(x).get(y) == -1);
    }

    private boolean solve(int x, int y, int step) {
        if (step == n * n) return true;

        // Apply Warnsdorff heuristic: try moves with fewest onward moves first
        int[][] moves = new int[8][3]; // [onwardMoves, nx, ny]
        int m = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isSafe(nx, ny)) {
                moves[m][0] = countOnwardMoves(nx, ny);
                moves[m][1] = nx;
                moves[m][2] = ny;
                m++;
            }
        }

        Arrays.sort(moves, 0, m, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < m; i++) {
            int nx = moves[i][1];
            int ny = moves[i][2];

            board.get(nx).set(ny, step);
            if (solve(nx, ny, step + 1)) return true;

            // backtrack
            board.get(nx).set(ny, -1);
        }

        return false;
    }

    // Count possible onward moves for heuristic ordering
    private int countOnwardMoves(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isSafe(nx, ny)) cnt++;
        }
        return cnt;
    }
}
