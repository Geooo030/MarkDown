/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        ListNode head = new ListNode();
        ListNode tmp = head;
        while(list1 != null && list2 != null) {
            if(Integer.compare(list1.val, list2.val) >= 0) {
                tmp.next = list2;
                list2 = list2.next;
            } else {
                tmp.next = list1;
                list1 = list1.next;
            }
            tmp = tmp.next;
        }
        if(list1 != null) {
            tmp.next = list1;
        } else {
            tmp.next = list2;
        }
        return head.next;

    }
}
// @lc code=end

