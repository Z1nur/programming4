public class Main5_else_if {
    public static void main(String[] args) {
        //Юзер вводит число с консоли. Надо вывести их отношение: больше, меньше или равны эти числа
        int a = 21;
        int b = 2;
        if (a > b) {
            System.out.println(a + ">" + b);
        }
        else if (a < b) {
            System.out.println(a + "<" + b);
        }
        else {
            System.out.println(a + " == " + b);
        }
    }
}
