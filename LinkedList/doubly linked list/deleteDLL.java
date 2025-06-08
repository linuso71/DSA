// import arrToDLL;
public class deleteDLL {
    public static void main(String[] args) {
        
        // Node head = arrToDLL.convertArrToDll(arr);
        int[] arr = {1,2,3,4};
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.previous = prev;
            prev = temp;
        }
        // head = deleteTail(head);
        deleteByValue(head.next.next);
        System.out.println(head);
        System.out.println(head.toString());
    }


    public static Node deleteHead(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head; // saving the old head ref in the previous
        head = head.next; // shift to next head
        head.previous = null; // removed the reference of head-> previous head(old head)
        temp.next = null; // removing reference from the old head ->  new head
        return head;

    }

    public static Node deleteTail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.previous;
        prev.next = null;
        temp.previous = null;

        return head;
    }

    public static Node deletekthelement(Node head,int k){
        Node temp = head;
        int count = 0;
        while(temp.next != null){
            if (count == k) break;
            count++;
            
            
            temp = temp.next;
        }
        // System.out.println(temp);
        
        Node prev = temp.previous;
        // System.out.println(prev);
        Node front = temp.next;
        // System.out.println(front);

        if (prev == null && front == null ){
            return null;

        }
        else if (prev == null){
            System.out.println("working");
            return deleteHead(head);
            
        }
        else if(front == null){
            return deleteTail(head);
        }
        else{
            prev.next = front;
            front.previous = prev;
            temp.next = null;
            temp.previous = null;
            return head;
        }

    }

    // delete the node from the value (not head)
    public static void deleteByValue(Node temp){
        Node prev = temp.previous;
        Node front = temp.next;
        
        if (front == null){
            prev.next = null;
            temp.previous = null;
            return;
        }

        prev.next = front;
        front.previous = prev;
        temp.next = null;
        temp.previous = null;
    }
}
