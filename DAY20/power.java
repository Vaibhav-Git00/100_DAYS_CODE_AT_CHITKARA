public class power {
    public static int powe(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=powe(x, n-1);
        int result=x*ans;
        return result;
    }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(powe(x, n));
    }
}
