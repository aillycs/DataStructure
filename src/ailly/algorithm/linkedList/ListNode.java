package ailly.algorithm.linkedList;

public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }

  public static ListNode getLinkedList(int[] arr) {
    ListNode head = new ListNode(-1);
    head.next = null;
    for (int i = 0; i < arr.length; i++) {
      ListNode node = new ListNode(arr[i]);
      node.next = head.next;
      head.next = node;
    }
    return head.next;
  }

  public static void printLinkedList(ListNode head) {
    if (head == null)
      return;
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }
}
