fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var llist1 = list1
    var llist2 = list2

    val outputListHead = ListNode(0)

    var outputLL:ListNode? = outputListHead

    while (llist1 != null && llist2 != null) {
        if (llist1.`val` <= llist2.`val`) {
            outputLL?.next = llist1
            llist1 = llist1.next
        } else {
            outputLL?.next = llist2
            llist2 = llist2.next
        }
        outputLL = outputLL?.next
    }
    if (llist1 == null) {
        outputLL?.next = llist2
    }
    if (llist2 == null) {
        outputLL?.next = llist1
    }
    return outputListHead.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main() {
    val list1 = ListNode(-9)
    list1.next = ListNode(3)
//    list1.next?.next = ListNode(4)
    val list2 = ListNode(5)
    list2.next = ListNode(7)
//    list2.next?.next = ListNode(4)
    mergeTwoLists(list1, list2)
}