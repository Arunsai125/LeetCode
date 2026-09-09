class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startingPixelColor = image[sr][sc];
        if (startingPixelColor == color) return image;
        int m = image.length;
        int n = image[0].length;
        image[sr][sc] = color;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                int[] top = q.poll();
                for(int j=0;j<4;j++){
                    int newX = top[0] + dx[j];
                    int newY = top[1] + dy[j];
                    if(newX>=0 && newX<m && newY>=0 && newY<n && image[newX][newY]==startingPixelColor){
                        image[newX][newY] = color;
                        q.add(new int[]{newX,newY});
                    }
                }
            }
        }
    return image;
    }
}