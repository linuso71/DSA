class Node {
    int data;
    Node next;

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
}

public class basic {
    public static void main(String args[]) {
        int[] arr = {2,5,6,8};
        Node y = new Node(arr[0]);
        System.out.println(y.data+" "+y.next);
    }
}