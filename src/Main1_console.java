import java.util.Scanner;

public class Main1_console {
    public static void main(String[] args) {

        //sout+enter -> System.our.println
        //ctrl+/ или cmd+/ -> comment/uncomment на английской раскладке


        Scanner scn = new Scanner(System.in);
        //Чтение целых чисел с консоли
//        System.out.print("Введите число а: ");
//        int a = scn.nextInt();
//        System.out.print("Введите число b: ");
//        int b = scn.nextInt();
//        int result = a+b;
//        System.out.println("Результат формулы =  "+result);


        //Чтение дробных чисел с консоли и сделать деление
//        System.out.print("Введите число x: ");
//        double x = scn.nextDouble(); //на windows дробные числа вводятся через запятую
//        System.out.print("Введите число y: ");
//        double y = scn.nextDouble();
//        double result2 = x/y;
//        System.out.println("Результат формулы =  "+result2);

        //Написать программу приветствия для юзера. Юзер вводит свое имя, а программа выводит hello, [name]!
//        System.out.print("Enter name: ");
//        String name = scn.next();
//        System.out.println("hello, "+name+"!");

        //Подстановка чисел в вывод на консоль
        System.out.print("Введите число а: ");
        int a = scn.nextInt();
        System.out.print("Введите число b: ");
        int b = scn.nextInt();
        System.out.print("Введите число c: ");
        int c = scn.nextInt();
        int result = a*(b+c);
        System.out.println(a+" + ("+b+" + "+c+ ") = "+result);
        System.out.printf("%d + (%d + %d) = %d", a, b,c, result);









    }
}
