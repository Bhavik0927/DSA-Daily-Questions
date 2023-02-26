public class Min_Max {
    static void findMinAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        if(arr == null || arr.length == 0) return;

        for(int i = 1; i< arr.length; i++){

            //first way
            /*if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max ){
                max  = arr[i];
            } */

            //Second Way
            min = Math.min(min, arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println(min + " min");
        System.out.println(max + " max");


    }
    public static void main(String[] args) {
        int[] arr = {12,5,74,8,923,1};
        findMinAndMax(arr);
        
    }
}
