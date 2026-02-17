class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int hour=0;hour<12;hour++){
            for(int minutes=0;minutes<60;minutes++){
                int totalHourBits = countBits(hour);
                int totalMinutesBits = countBits(minutes);
                if(totalHourBits + totalMinutesBits == turnedOn){
                    StringBuilder sb = new StringBuilder();
                    sb.append(hour);
                    sb.append(":");
                    if(minutes>=0 && minutes<=9) sb.append("0");
                    sb.append(minutes);
                    ans.add(sb.toString());
                }
            }
        }
    return ans;
    }
    public int countBits(int val){
        String str = Integer.toBinaryString(val);
        int ans=0;
        for(char ch : str.toCharArray()){
            if(ch == '1') ans++;
        }
    return ans;
    }
}