import java.util.*;
public class lonely {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> result=new ArrayList<>();
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1 && !hm.containsKey(nums[i]+1) && !hm.containsKey(nums[i]-1)){
                result.add(nums[i]);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[]={10,6,5,8};
        System.out.println(findLonely(arr));
    }
}
