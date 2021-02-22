public class Task {
    public static void main(String[] args) {
        //Вывести нужное количество чисел с переходом и без перехода на новую строку
        int a = 0;
        int b = 10;
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number1);
        }
    }
}
