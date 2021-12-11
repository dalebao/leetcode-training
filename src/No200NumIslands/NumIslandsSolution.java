package No200NumIslands;

public class NumIslandsSolution {

    public int numIslands(char[][] grid) {
        int n = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    n++;
                    dfs(grid, i, j);
                }
            }
        }
        return n;
    }

    public void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r > grid.length - 1 || c < 0 || c > grid[0].length - 1) {
            return;
        }

        if (grid[r][c] != '1') {
            return;
        }

        grid[r][c] = '2';

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
