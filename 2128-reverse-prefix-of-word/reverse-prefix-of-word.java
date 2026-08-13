class Solution {
    public String reversePrefix(String word, char ch) {
        int index=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
            if(index==-1){
                return word;
            }
        }
        String target = word.substring(0,index+1);
        StringBuilder sb= new StringBuilder(target).reverse();
        String restOfWord = word.substring(index + 1); 
        return sb.toString()+restOfWord ;  
    }
}