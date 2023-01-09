import java.util.Scanner;

public class Main2_if_else {
    public static void main(String[] args) {
        //Есть два числа. Вывести на консоль: равны они или нет
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();

        //способ 2
        if(a == b){
            System.out.println("Числа равны");
        }
        else{
            System.out.println("Числа не равны");
        }


        //способ 1
//        if(a == b){
//            System.out.println("Числа равны");
//        }
//        if(a != b){
//            System.out.println("Числа не равны");
//        }
    }
}
