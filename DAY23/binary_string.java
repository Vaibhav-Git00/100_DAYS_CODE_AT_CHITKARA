

public class binary_string {
    public static void printbinary(int n,int lastplace,String str){
        if (n==0) {
            System.out.println(str);
            return;
        }
        printbinary(n-1, 0, str+"0");
        if(lastplace==0){
            printbinary(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n=3;
        printbinary(n, 0, "");
    }
}
