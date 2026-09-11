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
        k-=1;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    static ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode temp=head,prev=null;
      while(temp!=null){
        ListNode kthNode=findNode(temp,k);
        if(kthNode==null){
            if(prev!=null) prev.next=temp;
            break;
        }
        ListNode nextNode=kthNode.next;
        kthNode.next=null;
        reverse(temp);
        if(temp==head){
            head=kthNode;
        }
        else{
            prev.next=kthNode;
        }
        prev=temp;
        temp=nextNode;

      }  
      return head;
    }
}