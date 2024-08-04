// public class subarray {
//     public static void sub(int arr[]){
//         int ts=0;
//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;j<arr.length;j++){
//                 int end =j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(arr[k]);
//                     ts++;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarray is :"+ts);
//     }
//     public static void main(String[] args) {
//         int n[]={1,3,5,6,7};
//         sub(n);
//     }
// }  
// public class subarray {
//     public static void sub(int arr[]){
//         int ts = 0;
//         for(int i = 0; i < arr.length; i++){
//             int start = i;
//             for(int j = i; j < arr.length; j++){
//                 int end = j;
//                 int sum = 0;
//                 for(int k = start; k <= end; k++){
//                     System.out.print(arr[k] + " ");
//                     sum += arr[k];
//                     ts++;
//                 }
//                 System.out.println(" Sum: " + sum);
//             }
//             System.out.println();
//         }
//         System.out.println("Total number of subarrays: " + ts);
//     }
//     public static void main(String[] args) {
//         int n[] = {1, 3, 5, 6, 7};
//         sub(n);
//     }
// }
public class subarray {
    public static void sub(int arr[]) {
        int n = arr.length;
        int ts = 0;

        // Calculate the total number of subarrays
        int totalSubarrays = (n * (n + 1)) / 2;
        int[] sumArray = new int[totalSubarrays];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    ts++;
                }
                sumArray[index++] = sum;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total number of subarrays: " + ts);

        // Print the sums stored in the sumArray
        System.out.print("Sum of each subarray: ");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n[] = {1, 3, 5, 6, 7};
        sub(n);
    }
}
