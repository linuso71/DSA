public class insertingElementLL {
    public static void main(String[] args) {
        int n = 1;
        int val = 3;
        int pos = 1;
        int[] arr = {1};
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        // head = insertAtHead(val, head);
        
        // System.out.println(head);
        // head = insertAtTail(5, head);
        // System.out.println(head);
        insertElementMid(head, n, pos, val);
        System.out.println(head);

    }

    static Node insertElementMid(Node head,int n,int pos,int val){
        Node temp = head;
        for (int i=1;i<pos;i++){
            temp = temp.next;
        }
        System.out.println(temp);
        Node value = new Node(val);
        value.next = temp.next;
        temp.next = value;
        

        return head;

        
    }

    static Node insertAtHead(int ele,Node head){
        Node temp = new Node(ele);
        temp.next = head;
        head = temp;
        return head;
    }

    static Node insertAtTail(int ele, Node head){
        Node temp = new Node(ele);
        Node mover = head;
        while(mover.next != null){
            mover = mover.next;
        }

        mover.next = temp;
        return head;
    }
}
