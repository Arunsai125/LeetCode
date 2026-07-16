class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hours = Integer.parseInt(endTime.substring(0,2)) - Integer.parseInt(startTime.substring(0,2));
        int minutes = Integer.parseInt(endTime.substring(3,5)) - Integer.parseInt(startTime.substring(3,5));
        int seconds = Integer.parseInt(endTime.substring(6)) - Integer.parseInt(startTime.substring(6));
    return (hours*60*60) + (minutes*60) + (seconds) ;
    }
}