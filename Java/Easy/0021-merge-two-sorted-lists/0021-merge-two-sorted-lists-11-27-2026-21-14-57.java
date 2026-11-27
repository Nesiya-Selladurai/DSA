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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // List<Integer> l=new ArrayList<>();
        // ListNode temp=list1;
        // while(temp!=null){
        //     l.add(temp.val);
        //     temp=temp.next;
        // }
        // List t2=list2;
        // while(t2!=null){
        //     l.add(t2.val);
        //     t2=t2.next;
        // }
      ListNode dummy=new ListNode();
        ListNode curr=dummy;
        while(list1!=null && list2!=null){
            if(list1.val > list2.val){
                curr.next=list2;
                list2=list2.next;
            }
            else{
                curr.next=list1;
                list1=list1.next;
            }
            curr=curr.next;
        }
        curr.next=(list1!=null) ? list1:list2;
        return dummy.next;
    }
}