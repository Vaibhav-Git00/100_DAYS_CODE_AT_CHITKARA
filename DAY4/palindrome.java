import java.util.Scanner;

public class palindrome {
    public static boolean is_palindrome(int n) {
        int original = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (is_palindrome(n)) {
            System.out.println("palindrome.");
        } else {
            System.out.println("not palindrome.");
        }
        sc.close();
    }
}
