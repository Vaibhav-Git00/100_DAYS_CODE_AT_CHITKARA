
public class decreasing_order {
    public static void decreseng(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        decreseng(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        decreseng(n);
    }
    
}
