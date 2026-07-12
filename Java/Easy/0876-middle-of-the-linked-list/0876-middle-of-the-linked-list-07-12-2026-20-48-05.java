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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        temp=head;
        int pos=cnt/2;
        //if(cnt%2==0) pos=(cnt/2)+1;
        while(temp!=null){
            if(pos==0){
                break;
            }
            else{
                pos--;
            }
            temp=temp.next;
        }
        return temp;
    }
}