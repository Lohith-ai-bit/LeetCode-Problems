class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=0;i<points.length-1;i++){
            int difx = Math.abs(points[i+1][0]-points[i][0]);
            int dify = Math.abs(points[i+1][1]-points[i][1]);
            ans+=Math.max(difx,dify);
        }
        return ans;
    }
}