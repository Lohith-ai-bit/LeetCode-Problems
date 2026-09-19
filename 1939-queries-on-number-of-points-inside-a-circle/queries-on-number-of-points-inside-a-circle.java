class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int cenx=queries[i][0];
            int ceny=queries[i][1];
            int r=queries[i][2];
            int count=0;
            for(int j=0;j<points.length;j++){
                int difx=cenx-points[j][0];
                int dify=ceny-points[j][1];
                int dist=(difx*difx)+(dify*dify);

                if(dist<=(r*r)){
                    count+=1;
                }
                
            }
            ans[i]=count;
        }
        return ans;
    }
}