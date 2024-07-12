import java.util.Scanner;

public class areaofCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Float pie= 3.14f;
        int radius= sc.nextInt();
        Float Area= pie*radius*radius;
        System.out.println(Area);
        sc.close();
    }
}
