
public class evenorodd {
    public static void check(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n=13;
        check(n);

    }
}
