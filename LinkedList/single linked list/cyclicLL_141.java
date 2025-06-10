import java.util.HashMap;

public class cyclicLL_141{
    public static void main(String[] args) {
        Node obj = new Node();
        int[] arr = {1,2,3,4};
        Node head = obj.getNode(arr);
         
    }

    public static boolean checkCyclic(Node head){
        HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            if (map.containsKey(temp)){
                return true;
            }
            else{
                map.put(temp, 1);
            }
        }
        return false;
    }
}