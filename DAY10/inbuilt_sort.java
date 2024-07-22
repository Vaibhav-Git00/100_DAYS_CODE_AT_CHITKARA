// import java.util.Arrays;  //for increasing order
// public class inbuilt_sort {
//     public static void print(int n[]){
//         for(int i=0;i<n.length;i++){
//             System.out.print(n[i]+" ");
//         }
//         System.err.println();
//     }
//     public static void main(String[] args) {
//         int arr[]={4,8,9,6,4,6};
//         // Arrays.sort(arr);  //for increasing order
//         Arrays.sort(arr,0,4); 
//         print(arr);
        
//     }
// }
import java.util.Arrays;
import java.util.Collections;   ////for decresing order
public class inbuilt_sort {
    public static void print(Integer n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        Integer arr[]={4,8,9,6,4,6};
        // Arrays.sort(arr,Collections.reverseOrder());      //for decresing order
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        print(arr);
        
    }
}
