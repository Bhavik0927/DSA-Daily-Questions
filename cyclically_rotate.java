import java.util.*;

public class cyclically_rotate{

    static void rotate(int arr[], int n)
    {
        // add last index value in x variable
        int x = arr[arr.length -1];
        
        //traverse the array from last to first
        for(int i = arr.length -1; i > 0; i--){

            // shifting value one by one
            arr[i] = arr[i-1];
        }
        
        arr[0] = x;
        
        System.out.print(Arrays.toString(arr));
        //System.out.println(arr);  // it gives ascii code;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,12};
        rotate(arr, 5);
    }
}