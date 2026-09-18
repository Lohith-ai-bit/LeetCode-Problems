class Solution {
    public String convertDateToBinary(String date) {
        String[] sarr = date.split("-");
        String[] binarr = new String[3];
        for(int i=0;i<sarr.length;i++){
            int value=Integer.parseInt(sarr[i]);
            String bin=Integer.toBinaryString(value);
            binarr[i]=bin;
        }
        String output= binarr[0]+"-"+binarr[1]+"-"+binarr[2];
        return output;
    }
}