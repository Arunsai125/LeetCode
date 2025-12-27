class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(image[sr][sc]==color) return image;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc] = color;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                int[] temp = q.poll();
                for(int j=0;j<4;j++){
                    int newX = temp[0] + dx[j];
                    int newY = temp[1] + dy[j];
                    if(newX>=0 && newX<image.length && newY>=0 && newY<image[0].length && image[newX][newY] == originalColor){
                        image[newX][newY] = color;
                        q.add(new int[]{newX,newY});
                    }
                }
            }
        }
    return image;
    }
}