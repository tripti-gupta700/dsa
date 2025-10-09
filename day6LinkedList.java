
public class day6LinkedList {
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

        System.out.println(removeNthNodeFromEnd(head, 2));
        System.out.println(removeNthNodeFromEndOptimised(head, 2));
    }

    // remove nth node from end
    // 1->2->3->4->5->null , n=2 , delete=4
    private static node removeNthNodeFromEnd(node head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        int pos = length - n + 1;
        head = null;
        int count = 1;
        while (count < pos) {
            count++;
            head = head.next;
        }
        head.next = head.next.next;
        return head;
    }

    private static node removeNthNodeFromEndOptimised(node head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        node fast = head;
        node slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // Intersection of two linkedlist
    private static node intersection(node head1, node head2) {
        if (head1 == null || head2 == null)
            return null;
        node p = head1, q = head2;
        while (p != q) {
            p = (p == null) ? head2 : p.next;
            q = (q == null) ? head1 : q.next;
        }
        return p; // either intersection node or null
    }
}
