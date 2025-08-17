import java.util.Arrays;
public class ArrSecondLargestElEx8 {
    public static int findSecondLargest(int [] arr)
    {
        int max, secMax;
        max = secMax = Integer.MIN_VALUE;

        for(int x: arr){
            if(x > max)
            {
                secMax = max;
                max = x;
            }else {
                if(x > secMax && x != max){
                    secMax = x;
                }
            }
        }
        return secMax;
    }
    public static void main(String[] args) {

        int arr [] = {2,3,1,6,4,11,43,};
        System.out.println (findSecondLargest(arr));
    }
}
