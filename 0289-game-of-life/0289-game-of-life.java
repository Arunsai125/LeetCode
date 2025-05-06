class Solution {
    public void gameOfLife(int[][] board) {
        int ans[][] = new int[board.length][board[0].length];
        int[] dir = {-1,0,1};
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int alive=0;
                for(int dx : dir){
                    for(int dy : dir){
                        if(dx==0 && dy==0) continue;
                        int newX = dx + i;
                        int newY = dy + j;
                        if(newX>=0 && newX < board.length && newY>=0 && newY<board[0].length && board[newX][newY]==1) alive++;
                    }
                }
                if( board[i][j]==1){ 
                    if( alive<2 || alive>3 ) ans[i][j] = 0;
                    else ans[i][j] = board[i][j];
                }
                if( board[i][j]==0) {
                    if(alive==3) ans[i][j]=1;
                    else ans[i][j] = board[i][j];
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = ans[i][j];
            }
        }
    }
}