class Solution {
public:
    bool findSafeWalk(vector<vector<int>>& grid, int health) {
        int m = grid.size();
        int n = grid[0].size();
        vector<pair<int, int>> directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        queue<pair<int, int>> q;
        q.push({0, 0});
        vector<vector<int>> maxHealth(m, vector<int>(n, 0));
        maxHealth[0][0] = health - grid[0][0];       
        while (!q.empty()) {
            auto [x1, y1] = q.front();
            q.pop();
            if (x1 == m - 1 && y1 == n - 1) {
                return maxHealth[x1][y1] >= 1;
            }
            for (auto [dx, dy] : directions) {
                int x2 = x1 + dx;
                int y2 = y1 + dy;
                if (x2 >= 0 && x2 < m && y2 >= 0 && y2 < n) {
                    int newHealth = maxHealth[x1][y1] - grid[x2][y2];
                    if (newHealth > maxHealth[x2][y2]) {
                        maxHealth[x2][y2] = newHealth;
                        q.push({x2, y2});
                    }
                }
            }
        }
        return false;
    }
};