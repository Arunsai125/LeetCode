class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean dir = false;
        int ptr=0;
        int[] ans = new int[m*n];
        for(int row=0;row<n;row++){
            int i = row;
            int j = 0;
            List<Integer> list = new ArrayList<>();
            while(i>=0 && i<n && j>=0 && j<m){
                list.add(mat[i][j]);
                i--;
                j++;
            }
            dir = !dir;
            if(dir==false) Collections.reverse(list);
            for(int ele : list) ans[ptr++] = ele;
        }
        for(int col=1;col<m;col++){
            int j=col;
            int i=n-1;
            List<Integer> list = new ArrayList<>();
            while(i>=0 && i<n && j>=0 && j<m){
                list.add(mat[i][j]);
                i--;
                j++;
            }
            dir = !dir;
            if(dir==false) Collections.reverse(list);
            for(int ele : list) ans[ptr++] = ele;
        }
    return ans;
    }
}