class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for(int[] obstacle : obstacles)  set.add(obstacle[0] + "," + obstacle[1]);
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int x=0;
        int y=0;
        int dir=0;
        int distance=0;
        for(int cmd : commands){
            if(cmd == -1) dir = (dir+1)%4;
            else if(cmd == -2) dir = (dir+3)%4;
            else{
                while(cmd-- > 0){
                    int newX = x + directions[dir][0];
                    int newY = y + directions[dir][1];
                    if(set.contains(newX + "," + newY)){
                        break;
                    }
                    x = newX;
                    y = newY;
                    distance = Math.max(distance, ((x*x)+(y*y)) );
                }
            }
        }
    return distance;
    }
}