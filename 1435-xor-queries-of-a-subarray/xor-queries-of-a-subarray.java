class Solution {
    private int[] tree;

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        tree = new int[4 * n];
        int[] ans = new int[m];
        
        build(0, n - 1, 0, arr);

        for(int i=0;i<m;i++) {
            ans[i] = query(queries[i][0], queries[i][1], 0, n - 1, 0);
        }
        return ans;
    }

    private void build(int ss, int se, int si, int[] nums) {
        if(ss > se)
            return;
        if(ss == se) {
            tree[si] = nums[ss];
            return;
        }

        int mid = ss + (se - ss)/ 2;
        build(ss, mid, 2 * si + 1, nums);
        build(mid + 1, se, 2 * si + 2, nums);

        tree[si] = tree[2 * si + 1] ^ tree[2 * si + 2];
    }

    private int query(int qs, int qe, int ss, int se, int si) {
        if(qs > se || qe < ss)
            return 0;
        if(qs <= ss && qe >= se)
            return tree[si];
        int mid = ss + (se - ss)/ 2;

        return query(qs, qe, ss, mid, 2 * si + 1) ^ query(qs, qe, mid + 1, se, 2 * si + 2);
    }
}
//didnt read yet ..i remember doing it with segment tree too...will see later when we get time