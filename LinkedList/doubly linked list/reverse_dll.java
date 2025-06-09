public class reverse_dll {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],prev,null);
            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        System.out.println(head);
        System.out.println(reverseDLL(head));
        
        
    }

    public static Node reverseDLL(Node head){
        Node prev = null;
        Node temp = head;
        while(temp != null){
            prev = temp.previous;
            temp.previous = temp.next;
            temp.next = prev;
            temp = temp.previous;
        }
        return prev.previous; // last node because temp is at null
    }


}
