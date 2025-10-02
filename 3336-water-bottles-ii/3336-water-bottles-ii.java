class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       int fullBottles = 0;
       int emptyBottles = numBottles;
       int bottlesDrunk = numBottles;
       while(emptyBottles >= numExchange || fullBottles != 0){
            if(emptyBottles < numExchange){
                emptyBottles += fullBottles;
                bottlesDrunk += fullBottles;
                fullBottles = 0;
            }
            while(emptyBottles >= numExchange){
                emptyBottles -= numExchange;
                fullBottles++;
                numExchange++;
            }
       }
    return bottlesDrunk;
    }
}