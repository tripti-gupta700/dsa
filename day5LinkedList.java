public class day5LinkedList {
    public static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
        private static node addAtEnd(node head, int data){
            node newNode=new node(data);
            if(head==null){return newNode;}
            node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
            return head;
        }
        private static node addAtBeginning(node head, int data){
            node temp=head;
            node newNode=new node(data);
            newNode.next=temp;
            return newNode;
        }
        private static node addAtPosition(node head, int data, int pos){
            node newNode=new node(data);
            node curr=head;
            int count=1;
            while(count<pos-1){
                curr=curr.next;
                count++;
            }
            newNode.next=curr.next;
            curr.next=newNode;
            return head;
        }
        private static node deleteAtStart(node head){
            node curr=head;
            head=head.next;
            return head;

        }
        private static node deleteAtEnd(node head){
            node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;

            }
            curr.next=null;
            return head;
        }
        private static node deleteAtPos(node head, int pos){
            node curr=head;
            int count=1;
            while(count !=pos-1){
                curr=curr.next;
                count++;
            }
            curr.next=curr.next.next;
            return head;
        }
    }
    public static void main(String[] args){
        node head = null;
        head=node.addAtEnd(head, 1);
        head=node.addAtEnd(head, 2);
        head=node.addAtEnd(head, 3);
        head=node.addAtEnd(head, 4);
        head=node.addAtEnd(head, 5);
        head=node.addAtBeginning(head, 0);
        head=node.addAtPosition(head, 6, 3);
        head=node.deleteAtStart(head);
        head=node.deleteAtEnd(head);
        head=node.deleteAtPos(head, 3);
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(length(head));
        System.out.println(search(head, 3));
        node reversedHead = reverse(head);
        node temp = reversedHead;
        while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
        }
        System.out.println();
        node mid = middle(head);
        System.out.println(mid.data);
        System.out.println(cycle(head));
        System.out.println(pallindrome(head));
    }
    // calculate length of linked list
    private static int length(node head){
        node curr=head;
        int count=0;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    // search an element in linked list
    private static boolean search(node head, int key){
        node curr=head;
        while(curr.data!=key){
            curr=curr.next;
        }
        return curr.data==key?true:false;
    }
    // reverse a linked list
    private static node reverse(node head){
        node prev=null;
        node curr=head;
        node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;

    }
    // middle of the linked list
    private static node middle(node head){
        node fast=head;
        node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    // linkedlist cycle
    private static boolean cycle(node head){
         node fast=head;
        node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow==fast?true:false;
    }
    // pallindrome linkedlist
    private static boolean pallindrome(node head){
         if (head == null || head.next == null) return true;
    //    1-find mid
    //    2- reverse second half
    //    3- compare first half and second half
    node fast=head;
    node slow=head;
    while(fast.next!=null && fast.next.next!=null){fast=fast.next.next;
    slow=slow.next;}
    slow.next=reverse(slow.next);
    node first=head;
    node second=slow.next;
    while(second!=null){
        if(first.data!=second.data){
            return false;
        }
        else{
            first=first.next;
            second=second.next;
        }
    }
    return true;
    }

}
