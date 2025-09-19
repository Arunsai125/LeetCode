class Pair{
    String food;
    int cost;
    public Pair(String food, int cost){
        this.food=food;
        this.cost=cost;
    }
}

class FoodRatings {
    Map<String, String> foodMap;
    Map<String, PriorityQueue<Pair>> cuisineMap;
    Map<String, Integer> ratingMap;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();
        ratingMap = new HashMap<>();
        int n = foods.length;
        for(int i=0;i<n;i++){
            foodMap.put(foods[i], cuisines[i]);
            if(!cuisineMap.containsKey(cuisines[i])){
                cuisineMap.put(cuisines[i], new PriorityQueue<Pair>((a,b) ->{
                    if(a.cost == b.cost) return a.food.compareTo(b.food);
                return b.cost - a.cost;
                }));
            }
            cuisineMap.get(cuisines[i]).offer(new Pair(foods[i], ratings[i]));
            ratingMap.put(foods[i], ratings[i]);
        }
    }
    
    public void changeRating(String food, int newRating) {
        ratingMap.put(food, newRating);
        String cuisine = foodMap.get(food);
        cuisineMap.get(cuisine).offer(new Pair(food, newRating));
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<Pair> pq = cuisineMap.get(cuisine);
        while(!pq.isEmpty()){
            Pair temp = pq.peek();
            String food = temp.food;
            int currRating = temp.cost;
            int targetRating = ratingMap.get(food);
            if(currRating == targetRating) return food;
            else pq.poll();
        }
    return "";
    }
}
