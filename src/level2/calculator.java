package level2;

import java.util.*;
public class calculator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char ch = sc.next().charAt(0);
        double result = 0;
        switch (ch) {
            case '+' :
                result = a+b;
                break;
            case '-' :
                result = a-b;
                break;
            case'*':
                result = a*b;
                break;
            case'/' :
                result = a/b;
                break;
            default :
                System.out.println("Invalid input");
        }
        System.out.println(result);

    }

}