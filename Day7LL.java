public class Day7LL {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }

        private static node addAtEnd(node head, int data) {
            node newNode = new node(data);
            if (head == null) {
                return newNode;
            }
            node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            return head;
        }

        private static node addAtBeginning(node head, int data) {
            node temp = head;
            node newNode = new node(data);
            newNode.next = temp;
            return newNode;
        }

        private static node addAtPosition(node head, int data, int pos) {
            node newNode = new node(data);
            node curr = head;
            int count = 1;
            while (count < pos - 1) {
                curr = curr.next;
                count++;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            return head;
        }

        private static node deleteAtStart(node head) {
            node curr = head;
            head = head.next;
            return head;

        }

        private static node deleteAtEnd(node head) {
            node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;

            }
            curr.next = null;
            return head;
        }

        private static node deleteAtPos(node head, int pos) {
            node curr = head;
            int count = 1;
            while (count != pos - 1) {
                curr = curr.next;
                count++;
            }
            curr.next = curr.next.next;
            return head;
        }
    }
    public static void main(String[] args) {
        node head = null;
        head = node.addAtEnd(head, 1);
        head = node.addAtEnd(head, 2);
        head = node.addAtEnd(head, 3);
        head = node.addAtEnd(head, 4);
        head = node.addAtEnd(head, 5);
        head = node.addAtBeginning(head, 0);
        head = node.addAtPosition(head, 6, 3);
        head = node.deleteAtStart(head);
        head = node.deleteAtEnd(head);
        head = node.deleteAtPos(head, 3);
        System.out.println(removeDuplicates(head));
        System.out.println(merge(head, head));
        System.out.println(oddEvenList(head));
    }
    // remove duplicates from a linkedlist
    private static node removeDuplicates(node head) {
        node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
    // Merge 2 sorted Lists
    private static node merge(node head1, node head2) {
        node curr1 = head1;
        node curr2 = head2;
        node head3 = null;
        while (curr1 != null && curr2 != null) {
            if (curr1.data < curr2.data) {
                head3 = node.addAtEnd(head3, curr1.data);
                curr1 = curr1.next;
            } else {
                head3 = node.addAtEnd(head3, curr2.data);
                curr2 = curr2.next;
            }
        }
        while (curr1 != null) {
            head3 = node.addAtEnd(head3, curr1.data);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            head3 = node.addAtEnd(head3, curr2.data);
            curr2 = curr2.next;
        }
    }
    // odd even list
    private static node oddEvenList(node head){
        node odd=head;
        node even = head.next;
        node evenHead=even;
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        even.next=null;
        odd.next=evenHead;
        return head;
    }
}
