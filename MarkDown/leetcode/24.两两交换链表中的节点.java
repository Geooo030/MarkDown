/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode quick;
        ListNode pre = null;
        ListNode next;
        while(slow != null && slow.next != null) {

            next = slow.next;
            quick = slow.next.next;
            if(pre == null) {
                head = head.next;
            } else {
                pre.next = next;
            }
            slow.next = quick;
            next.next = slow;
            pre = slow;
            slow = quick;
        } 
        return head;
    }
}
// @lc code=end

