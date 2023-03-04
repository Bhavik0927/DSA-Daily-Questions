public class Kadans_algo {


    // static long SumOfmaxSubArray(int[] arr,int n){
    //     int maxSum = 0;
    //     int curSum = 0;

    //     for(int i = 0; i< n; i++){
    //         curSum = curSum + 1;

    //         if(curSum > maxSum){
    //             maxSum = curSum;
    //         }

    //         if(curSum < 0){
    //             curSum = 0;
    //         }
    //     }
    //     return maxSum;
    // }


    static long maxSubarraySum(int arr[], int n){
        
        int maxSum = arr[0];
        int curSum =arr[0];
        
        for(int i = 1; i< n; i++){
           if(curSum >= 0){
               curSum += arr[i];
           }else{
               curSum = arr[i];
           }
           
           if(curSum > maxSum){
               maxSum = curSum;
           }
        }
        return maxSum;
        
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,-2,5};

       
        System.out.println(maxSubarraySum(arr, 5) );
    }
}
