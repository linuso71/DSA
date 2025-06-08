class Node{
        int data;
        Node previous;
        Node next;

        Node(int data,Node previous,Node next){
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }

        @Override
        public String toString() {
            return data + (next != null ? " <-> " + next.toString() : "");
        }
    }


public class arrToDLL {
    
        public static void main(String[] args) {
            int[] arr = {1,2,3,4};
            Node head = convertArrToDll(arr);
            System.out.println(head.toString());
            
        }

        public static Node convertArrToDll(int[] arr){
            Node head = new Node(arr[0]);
            Node previous = head;
            
            for(int i=1;i<arr.length;i++){
                Node temp = new Node(arr[i],previous,null);
                previous.next = temp;
                previous = temp;
            }
            return head;
        }
}