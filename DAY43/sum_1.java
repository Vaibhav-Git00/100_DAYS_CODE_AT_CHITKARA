import java.util.*;
public class sum_1 {
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
    public static boolean checkpairsum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        int target=12;
        System.out.println(checkpairsum(list, target));
        
        

    }
}
