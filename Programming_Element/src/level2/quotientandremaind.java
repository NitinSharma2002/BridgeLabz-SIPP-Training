package level2;

import java.util.Scanner;
public class quotientandremaind {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rem = num1%num2;
        int quot = num1/num2;
        System.out.println(rem);
        System.out.println(quot);

    }

}
