public class tiling_problem {
    public static int tilling(int n){   //n is showing no of lenght or columns (2 x n) floor size breadth toh pata hi haiii
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tilling(n-1);  //vertical
        int fnm2=tilling(n-2);  //horizotal
        int total=fnm1+fnm2;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
}
