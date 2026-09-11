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
    static ListNode findNode(ListNode temp,int k){
        int cnt=1;
        while(temp!=null ){
            if(cnt==k) return temp;
            temp=temp.next;
            cnt++;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int len=1;
        ListNode tail=head;
        if(head==null || k==0) return head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        ListNode temp=findNode(head,len-k);
        head=temp.next;
        temp.next=null; 
        return head;
    }
}