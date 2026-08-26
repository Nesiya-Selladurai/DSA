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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast.next !=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        ListNode t1=head,t2=newhead;
        while(t2!=null){
            if(t1.val!=t2.val){
                //reverse(newhead);
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
       //reverse(newhead);
        return true;
    }
    static ListNode reverse(ListNode h){
        ListNode curr=h,prev=null,nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}