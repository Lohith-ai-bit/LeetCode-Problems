class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start=startTime.split(":");
        String[] end=endTime.split(":");
        int diff=0;
        int standard=3600;
        for(int i=0;i<start.length;i++){
            int times=Integer.parseInt(start[i]);
            int timee=Integer.parseInt(end[i]);
            
            
            diff+=(standard*(timee-times));
            standard/=60;
        }
        return diff;
    }
}