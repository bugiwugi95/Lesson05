package lesson5;


import java.util.Scanner;

public class lesson5_Eng {
    public static void main(String[] args) {
//9
//        char a = 'a';
//        while ((int) a <= 122) {
//            System.out.print(a);
//            a++;
//        }
//        System.out.println();
        //10
//        Scanner sc = new Scanner(System.in);
//        int chr = sc.nextInt();
//        if (chr >= 97 && chr <= 122){
//            System.out.println((char) chr);
//        }

        //11
//        double random =  Math.random();
//        int result = (int) (random * 97);
//        System.out.println((char) result);
//12
        double random = Math.random();
        int max = 22;
        int min = 11;
        max -= min;
        double result = (int) (random * max) + min;
        System.out.println(result);


    }

}
