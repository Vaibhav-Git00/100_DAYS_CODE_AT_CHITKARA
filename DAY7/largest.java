

public class largest {
    public static int largestt(int num[]){
        int lar=Integer.MIN_VALUE; //-infinity
        int small=Integer.MAX_VALUE; //+infinity
        for(int i=0;i<num.length;i++){
            if(num[i]>lar){
                lar=num[i];
            }
            if(num[i]<small){
                small=num[i];
            }
        }
        System.out.println(small);
        return lar;
        
    }
        public static void main(String[] args) {
        int arr[]={23,45,6,78,98};
        System.out.println(largestt(arr));
    }
}
