public class ArrFinalconEx4 {
    public static void main(String args [])
    {
        // arr declaration

        int arr [] = {10,20,30,40,50};

        // for normal loop
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        // for each loop
        for(int x: arr){
            System.out.println(x);
        }
    }
}
