// Move all negative numbers to beginning and positive to end with constant extra space
public class Vth_Question {

    static void moveLeft(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            if(arr[low] <= 0){
                low++;
            }else{
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2,  -4, -5, 2, -7, 3,
            2, -6, -8, -9, 3, 2,  1 };

        moveLeft(arr);
        
        for (int e : arr)
        System.out.print(e + " ");
    }
}
