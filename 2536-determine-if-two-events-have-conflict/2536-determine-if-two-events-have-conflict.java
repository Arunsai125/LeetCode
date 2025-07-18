class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int event1StartTime = Integer.valueOf(event1[0].substring(0,2)) * 60 + Integer.valueOf(event1[0].substring(3));
        int event1EndTime = Integer.valueOf(event1[1].substring(0,2)) * 60 + Integer.valueOf(event1[1].substring(3));
        int event2StartTime = Integer.valueOf(event2[0].substring(0,2)) * 60 + Integer.valueOf(event2[0].substring(3));
        int event2EndTime = Integer.valueOf(event2[1].substring(0,2)) * 60 + Integer.valueOf(event2[1].substring(3));
        if ( (event1StartTime >= event2StartTime && event1StartTime <= event2EndTime) || (event2StartTime >= event1StartTime &&             event2StartTime <= event1EndTime) ) return true;
    return false;
    }
}