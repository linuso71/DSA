class Node {
    int data;
    Node next;
    Node(){
        
    }

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
    @Override
    public String toString() {
        return data + (next != null ? " -> " + next.toString() : "");
    }

    public Node getNode(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
    
        for (int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp; // linking previous node and the next node
            mover = temp; // moving the previous node to link with the next node

        }
        return head;
    }
}

public class basic {
    public static void main(String args[]) {
        int[] arr = {2,5,6,8};
        Node y = new Node(arr[0]);
        System.out.println(y.data+" "+y.next);
    }
}