public class lemonade {
    public static boolean lemonadeChange(int[] bills) {
        int five =0, ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)five++;
            else if(bills[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{                        //20 wali condition
                if(five>0 && ten >0){
                    five--;
                    ten--;
                }
                else if(five>2){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int bills[]={5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}
