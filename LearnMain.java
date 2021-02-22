import java.util.Scanner;

public class LearnMain {
    public static void main(String[] args) {
        //Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = vvod.nextInt();
            int y = vvod.nextInt();

            System.out.println("Sum= " + (x + y));
            System.out.println("Proisvedenie= " + (x * y));
        }
    }
}