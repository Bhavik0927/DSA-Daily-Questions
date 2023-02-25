public class reverseArray{

    static void  reverse(int first,int end,int arr[]){
        int temp;
        while(first < end){
            temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }
    }

    static void printArray(int arr[],int size){
        for(int i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};

        printArray(arr, 6);
        reverse(0, 5, arr);
        printArray(arr, 6);
    }
}