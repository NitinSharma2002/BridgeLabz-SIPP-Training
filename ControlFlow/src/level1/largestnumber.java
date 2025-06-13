package level1;
import java.util.*;
public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int first = 0;
        int second = 0;
        int third = 0;
        if(a>b && a>c) {
            first = a;
        }
        if(b>a && b>c) {
            second = b;
        }
        if(c>a && c>b) {
            third = c;
        }
        System.out.println("first larget " + first );
        System.out.println(" second larget " + second );
        System.out.println(" third larget " + third);


    }
}
