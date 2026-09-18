/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            int value = helper(slow.val,fast.val);
            ListNode dummy = new ListNode(value);
            dummy.next=fast;
            slow.next=dummy;
            slow=fast;
            fast=fast.next;
        }
        return head;
    }
    private int helper(int a,int b){
            while(b!=0){
                int remi = a%b;
                a=b;
                b=remi;
            }
            return a;
    }
}