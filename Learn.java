import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {

        //2.Отобразить в окне консоли аргументы командной строки в обратном порядке
                Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer toll = new StringBuffer(vvod.nextLine());
            toll.reverse();
            System.out.println(toll.toString()); //relbmessa
        }
    }
}
