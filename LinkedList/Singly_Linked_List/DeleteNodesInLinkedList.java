package LinkedList.Singly_Linked_List;

public class DeleteNodesInLinkedList {
    public static void main(String[] args) {
        int[] arr = { 93, 4, 34, 65, 10};
        Node head = LinkedList.ConvertArrToLinkedList(arr);
        System.out.println();
        System.out.print("Original Linked List : ");
        LinkedList.PrintLinkedList(head);

        Node test1 = DeleteAtStart(head);
        System.out.print("After Deleting Starting Node : ");
        LinkedList.PrintLinkedList(test1);

        Node test2 = DeteleAtEnd(head);
        System.out.print("After Deleting Ending Node : ");
        LinkedList.PrintLinkedList(test2);

        Node test3 = DeleteAtPosition(head,2);
        System.out.print("After Deleting Ending Node : ");
        LinkedList.PrintLinkedList(test3);
    }

    public static Node DeleteAtStart(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static Node DeteleAtEnd(Node head){
        if(head == null || head.next == null) return head;
        Node mover = head;
        while(mover.next.next != null){
            mover = mover.next;
        }
        mover.next = null;
        return head;
    }

    public static Node DeleteAtPosition(Node head, int position) {
        if(head == null) return head;
        if(position==1) DeleteAtStart(head);

        int count = 0;
        Node mover = head;
        Node prev = null;

        while(mover != null){
            count++;
            if(count == position){
                prev.next = prev.next.next;
                break;
            }
            prev = mover;
            mover = mover.next;
        }
        return head;
    }
}
