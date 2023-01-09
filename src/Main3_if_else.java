import java.util.Scanner;

public class Main3_if_else {
    public static void main(String[] args) {
        //Проверить перед делением, что знаменатель не 0
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        double b = scn.nextInt();

        if(b!=0) {
            System.out.println(a / b);
        }else{
            System.out.println("На ноль делить нельзя");
        }
        System.out.println("finish");
    }
}
