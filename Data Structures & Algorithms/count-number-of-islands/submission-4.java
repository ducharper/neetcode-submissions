class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    dfs(grid, x, y);
                    num++;
                }
            }
        }

        return num;
    }

    private void dfs(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || y >= grid.length || x >= grid[0].length || grid[y][x] != '1') {
            return;
        }

        grid[y][x] = '0'; 

        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}
