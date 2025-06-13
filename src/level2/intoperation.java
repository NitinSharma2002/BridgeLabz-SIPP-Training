package level2;

import java.util.*;
public class intoperation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1 = a+b*c;
        int result2 = a*b+c;
        int result3 = c+a/b;
        int result4 = a%b+c;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);



    }

}
