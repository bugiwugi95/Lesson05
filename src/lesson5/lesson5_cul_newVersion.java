package lesson5;

import java.util.Scanner;

public class lesson5_cul_newVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter1 = sc.nextInt();
        char op1 = sc.next().charAt(0);
        int enter2 = sc.nextInt();
        char op2 = sc.next().charAt(0);
        int enter3 = sc.nextInt();
        int result = 0;
        if (op1 == '*') {
            if (op2 == '-') {
                result = (enter1 * enter2) - enter3;
            } else if (op2 == '+') {
                result = (enter1 * enter2) + enter3;
            }
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + op2 + " " + enter3 + " = " + result);

        }
        if (op1 == '/') {
            if (op2 == '-') {
                result = (enter1 / enter2) - enter3;
            } else if (op2 == '+') {
                result = (enter1 / enter2) + enter3;
            }
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + op2 + " " + enter3 + " = " + result);
        }

        if (op2 == '*') {
            if (op1 == '-') {
                result = enter1 - (enter2 * enter3);
            } else if (op1 == '+') {
                result = enter1 + (enter2 * enter3);
            }

            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + op2 + " " + enter3 + " = " + result);
        }
        if (op2 == '/') {
            if (op1 == '-') {
                result = enter1 - (enter2 / enter3);
            } else if (op1 == '+') {
                result = enter1 + (enter2 / enter3);
            }
            System.out.println(enter1 + " " + op1 + " " + enter2 + " " + op2 + " " + enter3 + " = " + result);
        }


    }
}
