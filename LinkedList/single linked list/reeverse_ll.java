import java.util.Stack;

public class reeverse_ll {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node obj = new Node();
        Node head = obj.getNode(arr);
        System.out.println(head);
        // sortLLUsingStack(head);
        // System.out.println(head);
        // System.out.println(sortLLUsingPrevious(head));
        System.out.println(sortLLUsingRecurssion(head));

    }


    public static void sortLLUsingStack(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            int data = st.pop();
            temp.data = data;
            temp = temp.next;
        }

    }


    public static Node sortLLUsingPrevious(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front  = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static Node sortLLUsingRecurssion(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = sortLLUsingRecurssion(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead; // returning the last element as new head 
    }


}
