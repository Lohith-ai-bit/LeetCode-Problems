class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9' && !arr.contains(s.charAt(i)-'0')){
                arr.add(s.charAt(i)-'0');
            }
            
        }
        Collections.sort(arr);
         if (arr.size() < 2) {
            return -1;
        }

        return arr.get(arr.size() - 2);
    }
}