class Solution {
    public int countCollisions(String directions) {
        char arr[] = directions.toCharArray();
        int ans=0;
        int left = 0;
        int right = directions.length()-1;
        while(left < directions.length() && arr[left] == 'L') left++;
        while(right >= 0 && arr[right] == 'R') right--;
        for(int i=left;i<=right;i++){
            if(arr[i] != 'S') ans++;
        }
    return ans;
    }
}