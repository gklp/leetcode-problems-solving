package com.leetcode.addTwoNumbers;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersProblemV1 {
    public static void main(String[] args) {
        ListNode nodeList1 = new ListNode(1);
        nodeList1.next = new ListNode(8);
        //nodeList1.next.next = new ListNode(3);

        ListNode nodeList2 = new ListNode(0);
        //nodeList2.next = new ListNode(9);
        //nodeList2.next.next = new ListNode(4);

        addTwoNumbers(nodeList1, nodeList2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        boolean hasCarry = false;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;

            int val = l1Val + l2Val;
            if (hasCarry) {
                val = val + 1;
            }
            hasCarry = val > 9;
            ListNode node = new ListNode(hasCarry ? val % 10 : val);
            if (result == null) {
                result = node;
            } else {
                ListNode tmp = result;
                while (result.next != null) {
                    result = result.next;
                }
                result.next = node;
                result = tmp;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            if (l1 == null && l2 == null & hasCarry) {
                node.next = new ListNode(1);
            }
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
