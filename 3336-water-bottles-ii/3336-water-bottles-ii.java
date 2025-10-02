class Solution {
    public int maxBottlesDrunk(int fullBottle, int numExchange) {
        int emptyBottle=0;
        int bottleDrunk=0;
        while(emptyBottle>=numExchange || fullBottle!=0){
            if(emptyBottle<numExchange){
                emptyBottle+=fullBottle;
                bottleDrunk+=fullBottle;
                fullBottle=0;
            }else{
                while(emptyBottle>=numExchange){
                    emptyBottle=emptyBottle-numExchange;
                    numExchange++;
                    fullBottle++;
                }
            }
        }
        return bottleDrunk;
        
    }
}