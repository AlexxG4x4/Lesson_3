package ru.geekbrains.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Guess_Number {

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число от 0 до 9 за 3 попытки!");
        guessNumber();
    }

    private static void guessNumber() {
        int i;
        boolean yesNo = true;
        Scanner scanner = new Scanner(System.in);
        while (yesNo == true){
            Random rand = new Random();
            int randomNumber = rand.nextInt(9);
            for (i = 0; i < 3; i++) {
                System.out.print("Введите число - ");
                int inputNumber1 = scanner.nextInt();
                if (inputNumber1 == randomNumber) {
                    System.out.println("Вы угадали!");
                    System.out.println("Вы выиграли!");
                    break;
                } else if (inputNumber1 < randomNumber) {
                    System.out.println("Загаданное число больше");
                } else System.out.println("Загаданное число меньше");
                System.out.println("Вы не угадали!");
            }
            System.out.println("Попробуем ещё? 1 - Да, 2 - Нет");
            int answer = scanner.nextInt();
            if (answer == 1){
                yesNo = true;
            }else yesNo = false;
        }
        scanner.close();
    }
}
