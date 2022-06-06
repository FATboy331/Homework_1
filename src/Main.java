import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String goodWork;                   // Задание №1
        final int NUM = 365;               // Задание №2
        String word = "Days in Year";      // Задание №3
        goodWork = NUM + " " + word;       // Задание №4
        System.out.println(goodWork);      // Задание №5

        if (NUM < 0) {                     // Задание №6
            System.out.println("let's go travel");

        } else if (NUM > 0) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good Work");
        }
        System.out.print("Введите ваше имя:");       // Доп задание 1
        Scanner in = new Scanner(System.in);          // Доп задание 2
        String name = in.nextLine();
        System.out.print("Приветствую тебя" + name);  // Доп задание 3


    }
}


