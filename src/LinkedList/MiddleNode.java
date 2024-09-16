package LinkedList;

class MiddleNode {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList middleNode(LinkedList linkedList) {
        LinkedList head = linkedList;
        LinkedList doubleHead = linkedList.next;
        if(head.next == null)
            return head;

        while(doubleHead!=null)
        {
            head = head.next;
            if(doubleHead.next !=null)
                doubleHead = doubleHead.next.next;
            else
                break;
        }
        return head;
    }
}

