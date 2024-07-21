package LinkedList.Singly_Linked_List;

public class ArrayToLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 4, 6};
        Node head = ConvertArrToLinkedList(arr);
        PrintLinkedList(head);
    }
    public static Node ConvertArrToLinkedList(int[] arr){
        if(arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
    public static void PrintLinkedList(Node head){
        System.out.println();
        System.out.print("[");
        Node mover = head;
        while(mover != null){
            if(mover.next == null){
                System.out.print(mover.data);
            }else{
                System.out.print(mover.data + ", ");
            }
            mover = mover.next;
        }
        System.out.println("]");
        System.out.println();
    }
}
