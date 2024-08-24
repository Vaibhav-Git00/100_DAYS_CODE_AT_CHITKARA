import java.util.*;

    //brute force can be applied sorted and unsorted 
    // public static int[] sum(ArrayList<Integer> number,int target){
    //     for(int i=0;i<number.size();i++){
    //         for(int j=i+1;j<number.size();j++){
    //             if(number.get(i)+number.get(j)==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int []{-1,-1};
    // }
    //2-pointer optimise way
    //this is onlly for sorted array
    // public static boolean checkpairsum(ArrayList<Integer> list,int target){
    //     int lp=0;
    //     int rp=list.size()-1;
    //     while(lp<rp){
    //         if(list.get(lp)+list.get(rp)==target){
    //             return true;
    //         }
    //         else if(list.get(lp)+list.get(rp)<target){
    //             lp++;
    //         }
    //         else{
    //             rp--;
    //         }
    //     }
    //     return false;
    // }

    //sorted & rotated array mod algorithumm
    public class sum_1 {
    public static boolean checkpairsum(ArrayList<Integer> list,int target){
        int bp= -1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(checkpairsum(list, target));
    }
}
