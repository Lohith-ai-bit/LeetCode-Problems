class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stud = new LinkedList<>();
        for (int i=0;i<students.length;i++){
            stud.offer(students[i]);
        }     
        int i=0;
        int count =0; 
        while(!stud.isEmpty() && count<stud.size() ){
            if(stud.peek()==sandwiches[i]){
                stud.poll();
                i++;
                count =0;
            }
            else{
                stud.offer(stud.poll());
                count++;
            }
        }
        return stud.size();
    }
}