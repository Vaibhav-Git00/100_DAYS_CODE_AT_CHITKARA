public class sortted_rotated {
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target) return mid;

            else if(nums[mid]>=nums[left]){
                if(nums[left]<=target && target<=nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            
            else{
                if(nums[mid]<=target && target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,1,3};
        int target=1;
        System.out.println(search(arr, target));
    }
}
