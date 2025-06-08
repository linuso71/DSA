public class insertDLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],prev,null);
            prev.next = temp;
            temp.previous = prev;
            prev = temp;

        }
        System.out.println(head.toString());  
        System.out.println(insertBeforeHead(head, -1));
        // insertBeforeTail(head, 5);
        // System.out.println(insertBeforeKthElement(head, 45, 4   ));
        insertUsingNodeBefore(head.next.next, 0);
        System.out.println(head);
        
    }


    public static Node insertBeforeHead(Node head,int value){
        Node newHead = new Node(value,null,head);
        head.previous = newHead;
        return newHead;
    }

    public static void insertBeforeTail(Node head,int value){
         // This way is also fine but 

        // Node temp = head;
        // while(temp.next.next != null){
        //     temp  = temp.next;
        // }

        // Node newEle = new Node(value,temp,temp.next);
        // temp.next.previous = newEle;
        // temp.next = newEle;


        // clean way

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.previous;
        Node newEle = new Node(value,prev,tail);
        tail.previous = newEle;
        prev.next = newEle;

    }

    public static Node insertBeforeKthElement(Node head,int value,int k){
        if (k == 1){
            return insertBeforeHead(head, value);
        }
        Node temp = head;
        int count = 1;
        while(temp != null){
            if (count == k) break;
            count ++;
            temp = temp.next;
        }

        Node prev = temp.previous;
        Node newEle = new Node(value,prev,temp);
        temp.previous = newEle;
        prev.next = newEle;
        return head;

    }

    public static void insertUsingNodeBefore(Node node,int value){
        Node prev = node.previous;
        Node newEle = new Node(value,prev,node);
        node.previous = newEle;
        prev.next = newEle; 
    }





    
}
