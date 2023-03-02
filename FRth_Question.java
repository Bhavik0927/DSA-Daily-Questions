// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo


public class FRth_Question {

    static void sorting(int[] arr) {
        int lo = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
            
        }
       

    }

    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
  

    public static void main(String[] args) {
        int[] arr = {0 ,2 ,1 ,2 ,0};
        
        sorting(arr);
        printArray(arr);
    }
}
