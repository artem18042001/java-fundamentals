import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Приветствовать пользователя при вводе имени
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Hello " + vvod.nextLine());
        }
    }
}
