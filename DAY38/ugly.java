
public class ugly {
    public static boolean check(int n){
        if(n==0){
            return false;
        }
        if(n<=3 && n>0){
            return true;
        }
        if(n%2==0){
            return check(n/2);
        }
        if(n%3==0){
            return check(n/3);
        }
        if(n%5==0){
            return check(n/5);
        }
        return false;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(check(n));
    }
}
