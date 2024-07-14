//overloading using parameters


// public class overloading {
//     public static int add(int a, int b){
//         return a+b;
//     }
//     public static int add(int a, int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(2, 3));
//         System.out.println(add(1,1,3));
//     }
// }
//overloading using parameters


public class overloading {
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(1.2f,2.2f,3.3f));
    }
}
