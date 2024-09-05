class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int res=0;
        int max=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    int temp=dfs(grid,i,j,0);
                    max=max>temp ? max:temp;
                }
            }
        }
        return max;
    }
    public static int dfs(int[][] grid,int i,int j,int area)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=1)
        return area;
        area++;
        grid[i][j]=0;
        area=dfs(grid,i,j-1,area);
        area=dfs(grid,i-1,j,area);
        area=dfs(grid,i+1,j,area);
        area=dfs(grid,i,j+1,area);
        return area;
    }
    
}
