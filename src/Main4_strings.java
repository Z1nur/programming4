import java.util.Scanner;

public class Main4_strings {
    public static void main(String[] args) {
        //Сравнение строк
        Scanner scn = new Scanner(System.in);
        String str1 = "hello";
        System.out.print("Enter string: ");
        String str2 = scn.next();
        //Вывести на консоль: равны строчки или нет
        if(str1.equals(str2)){
            System.out.println("Равны");
        }else{
            System.out.println("Не равны");
        }
    }
}
