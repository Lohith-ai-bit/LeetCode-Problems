class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<>();
        int sum1=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                stack.add(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
            }
            else if(operations[i].equals("D")){
                stack.add(stack.get(stack.size() - 1) * 2);
            }
            else if(operations[i].equals("C")){
                stack.remove(stack.size() - 1);
            }
            else{
                stack.add(Integer.parseInt(operations[i]));
            }
        }
        for (int num : stack) {
            sum1 += num;
        }
       return sum1;
        
    }
}