/**
* public class ListNode {
*   int val;
*   ListNode next;
*   ListNode(int x) { val = x;}
*}
*/
class Solution {
    public LisNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);               // new一个初值为0的ListNode对象pre
        ListNode cur = pre;                           // cur指向pre
        int carry = 0;
        while (l1 != null || l2 != null) {            // l1,l2两个链表不为空
            int x = l1 == null ? 0 : l1.val;          // x = l1.val,赋值一个链表的第一个值
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;                  // 两个链表的和
            
            carry = sum / 10;                         // 进位等于sum / 10
            sum = sum % 10;
            cur.next = new LisNode(sum);              // cur头结点指向的下一个链表值等于sum
            
            cur = cur.next;                           // cur进行移动到下一个节点
            if(l1 != null)                            
                l1 = l1.next;                         // l1 链表的遍历
            if(l2 != null)
                l2 = l2.next;                         // l2 链表的遍历
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}
