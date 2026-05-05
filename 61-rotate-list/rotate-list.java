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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;

        int count=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            count+=1;
        }
        k = k % count;

        if (k==0) return head;

        curr.next=head;

        ListNode temp=head;
        for(int i=0;i<count-k-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;

        return head;
        
    }
}