import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите первое число число: ");
        int firstNumber  = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число число: ");
        int secondNumber  = new Scanner(System.in).nextInt();

        int summa =  firstNumber+secondNumber;
        System.out.println("Сумма: " + summa);

        int raznost =  firstNumber-secondNumber;
        System.out.println("Разность: " + raznost);

        int proizvedenie =  firstNumber*secondNumber;
        System.out.println("Произведение: " + proizvedenie);

        double quotient = (double) firstNumber/secondNumber;
        System.out.println("Частное от деления: " + quotient);
    }
}
