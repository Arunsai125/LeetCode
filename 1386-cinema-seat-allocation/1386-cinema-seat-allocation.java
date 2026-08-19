class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] seats : reservedSeats) {
            int row = seats[0];
            int seat = seats[1];
            if (!map.containsKey(row)) {
                map.put(row, new ArrayList<>());
            }
            map.get(row).add(seat);
        }
        int ans = 2 * n;
        for (List<Integer> occupied : map.values()) {
            boolean left = !occupied.contains(2)
                    && !occupied.contains(3)
                    && !occupied.contains(4)
                    && !occupied.contains(5);

            boolean middle = !occupied.contains(4)
                    && !occupied.contains(5)
                    && !occupied.contains(6)
                    && !occupied.contains(7);

            boolean right = !occupied.contains(6)
                    && !occupied.contains(7)
                    && !occupied.contains(8)
                    && !occupied.contains(9);

            if (left && right) {
            } else if (left || middle || right) {
                ans--;
            } else {
                ans -= 2;
            }
        }
        return ans;
    }
}