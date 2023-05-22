import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secodNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber + secodNumber;
        int dif = firstNumber - secodNumber;
        int multiply = firstNumber * secodNumber;
        double quotient = (double) firstNumber / secodNumber;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + dif);
        System.out.println("Произведение: " + multiply);
        System.out.println("Частное: " + quotient);


    }
}
