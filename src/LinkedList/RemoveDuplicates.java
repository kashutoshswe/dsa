package LinkedList;

public class RemoveDuplicates {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList head = linkedList;
        while(head != null)
        {
            if(head.next !=null &&  head.value == head.next.value)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return linkedList;
    }
}
