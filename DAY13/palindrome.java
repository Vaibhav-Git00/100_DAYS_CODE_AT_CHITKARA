import java.util.Scanner;

public class palindrome {
    public static boolean check(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st= sc.nextLine();
        System.out.println(check(st));
        sc.close();
    }
}
