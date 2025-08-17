import java.util.Arrays;

public class ArrSecondLArgestElEx6 {

    public static int findSecondLargest(int [] arr){

        Arrays.sort(arr);
        return arr [arr.length-2];
    }

    public static void main(String[] args) {

        int arr [] = {2,13,2,3,16,28};
        System.out.println (findSecondLargest(arr));
    }
}
