class Solution {
    public int[] sortByBits(int[] arr) {
        int n= arr.length;
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int k = Integer.bitCount(arr[i]);
            list.add( new int[]{arr[i],k});
        }
        Collections.sort(list,(a,b)->a[1]!=b[1] ? a[1]-b[1]:a[0]-b[0]);
        int[] res =new int[n];
        for(int j=0;j<list.size();j++){
            res[j]=list.get(j)[0];
        }
        return res;
     }

}