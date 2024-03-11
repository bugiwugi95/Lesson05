package lesson5;

import java.util.Scanner;

public class lesson5_cul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter1 = sc.nextInt();
        char op1 = sc.next().charAt(0);
        int enter2 = sc.nextInt();
        char op2 = sc.next().charAt(0);
        int enter3 = sc.nextInt();
        int result1To2 = 0;
        int result3;
        if (op1 == '+') {
            result1To2 = enter1 + enter2;
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + " = " + result1To2);
        }
        if (op1 == '-') {
            result1To2 = enter1 - enter2;
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + " = " + result1To2);
        }
        if (op1 == '/') {
            result1To2 = enter1 / enter2;
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + " = " + result1To2);
        }
        if (op1 == '*') {
            result1To2 = enter1 * enter2;
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + " = " + result1To2);
        }

        if (op2 == '+') {
            result3 = result1To2 + enter3;
            System.out.println(result1To2 + " " + op2 + " " + enter3 + " = " + result3);

        }
        if (op2 == '-') {
            result3 = result1To2 - enter3;
            System.out.println(result1To2 + " " + op2 + " " + enter3 + " = " + result3);
        }
        if (op2 == '/') {
            result3 = result1To2 / enter3;
            System.out.println(result1To2 + " " + op2 + " " + enter3 + " = " + result3);
        }
        if (op2 == '*') {
            result3 = result1To2 * enter3;
            System.out.println(result1To2 + " " + op2 + " " + enter3 + " = " + result3);
        }




    }
}
