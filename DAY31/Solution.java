// import java.util.Arrays;
// public class neww {

//     public static void main(String[] args) {
//         int arr[]={7,8,3,4,15,13,4,1};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));

//     }
// }
public class Solution {
    public static int majorityElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                count++;
            }
            
            if(count> nums.length/2) return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,3};
        System.out.println(majorityElement(arr));
    }
}