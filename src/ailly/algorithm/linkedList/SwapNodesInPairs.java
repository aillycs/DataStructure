package ailly.algorithm.linkedList;

/**
 * 24. Swap Nodes in Pairs
 *
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPairs {

  public static ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode cur1 = head;
    while (cur1 != null && cur1.next != null) {
      ListNode cur2 = cur1.next;
      ListNode next = cur2.next;
      prev.next = cur2;
      cur2.next = cur1;
      cur1.next = next;
      prev = cur1;
      cur1 = next;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode list = ListNode.getLinkedList(new int[]{6, 5, 4, 3, 2, 1});
    ListNode.printLinkedList(list);
    System.out.println("after swap");
    ListNode.printLinkedList(swapPairs(list));
  }
}
