public class increasing_order {
    public static void increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        increasing(n-1);
        System.out.print(n+" ");
        
    }

    public static void incr(int a,int n){
        if(a>n) return;
        System.out.print(a+" ");
        incr(a+1, n);
        return;
    }
    public static void main(String[] args) {
        int n=10;
        increasing(n);
        System.out.println();
        incr(1,n);
    }
}
