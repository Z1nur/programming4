import java.util.Scanner;

public class Main6_else_if {
    public static void main(String[] args) {
        //Определить название дня недели, если пользователь вводит его номер (от 1 до 7) с консоли.
        // В случае ввода некорретного значения, программа должна вывести на консоль текст "Некорректный номер".
        // Рассмотреть на этом примере разницу между else if и отдельными if.
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter day name: ");
        String day = scn.next();
        if(day.equals("пн")){
            System.out.println(1);
        }
        else if(day.equals("вт")){
            System.out.println(2);
        }
        else if(day.equals("ср")){
            System.out.println(3);
        }
        else if(day.equals("чт")){
            System.out.println(4);
        }
        else if(day.equals("пт")){
            System.out.println(5);
        }
        else if(day.equals("сб")){
            System.out.println(6);
        }
        else if(day.equals("вс")){
            System.out.println(7);
        }else{
            System.out.println("Некорректный день недели");
        }
        System.out.println("finish");


    }
}
