import java.util.Arrays;

public class max_units_truck_1710{
    public static void main(String[] args) {
        int[][] boxes = {{1,3},{2,2},{3,1}};
        int truckSize = 10;
        System.out.println(maximumUnits(boxes,truckSize));

    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]);
        // Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        System.out.println(Arrays.toString(boxTypes));
        return 1;
    }
}