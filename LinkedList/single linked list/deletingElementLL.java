

public class deletingElementLL {
   public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }



        // head = deleteKEle(head, 1);
        head = removeEle(head, new Node(1));
        System.out.println(head);
    }

    static Node deleteKEle(Node head,int pos){
        // Node mover = head;
        // Node previous = mover;
        // for(int i=0;i<pos;i++){
        //     System.out.println("working");
        //     previous = mover;
        //     mover = mover.next;
        // } 
        
        // previous.next = mover.next;
        // return head;

        // if (pos == 0){
        //     head = head.next;
        // }

        if (pos == 1){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node previous = null; 
        int count = 0;
        while (temp != null){
            count++;
            if(count == pos){
                previous.next = previous.next.next;
                break;
            }
            previous = temp;
            temp =temp.next;
        }
        return head;

    }

    static Node removeEle(Node head,Node ele){

        if (head.data == ele.data){
            head = head.next;
        }

        Node temp = head;
        Node previous = null;
        while(temp != null){
            if (temp.data == ele.data){
                previous.next = previous.next.next;

            }

            previous = temp;
            temp = temp.next;
            
        }
        return head;
    }
}
