class Pair{
    private int r;
    private int c;
    public Pair(int r, int c){
        this.r=r;
        this.c=c;
    }
    public int getR(){
        return this.r;
    }
    public int getC(){
        return this.c;
    }
}
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<Pair> q = new LinkedList<>();
        int n = isWater.length;
        int m = isWater[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    isWater[i][j] = 0;
                    q.add(new Pair(i,j));
                }
                else isWater[i][j]=-1;
            }
        }
        while(!q.isEmpty()){
            Pair temp = q.poll();
            int r = temp.getR();
            int c = temp.getC();
            int x[] = {-1,0,1,0};
            int y[] = {0,1,0,-1};
            for(int i=0;i<4;i++){
                int newX = r + x[i];
                int newY = c + y[i];
                if(newX>=0 && newX<n && newY>=0 && newY<m && isWater[newX][newY]==-1){
                    isWater[newX][newY] = isWater[r][c] + 1;
                    q.add(new Pair(newX,newY));
                }
            }
        }
    return isWater;
    }
}