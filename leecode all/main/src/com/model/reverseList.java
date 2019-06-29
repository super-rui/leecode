package com.model;

public class reverseList {

    /**
     * 遍历解法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode nextNode = head;
        while(nextNode != null){
            ListNode current = nextNode;
            nextNode = nextNode.next;
            current.next = pre;
            pre = current;
        }
        return pre;
    }

    /**
     * 递归解法
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        // 返回尾部结点
        if(head == null || head.next == null) return head;
        //在这记录尾部节点
        ListNode pre = reverseList2(head.next);
        //对每个结点做操作  反转 把下一个指向自己
        head.next.next = head;
        head.next = null;
        return pre;
    }
}
