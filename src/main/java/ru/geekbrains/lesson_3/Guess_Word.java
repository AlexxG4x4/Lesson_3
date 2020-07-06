package ru.geekbrains.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Guess_Word {
    public static void main(String[] args) {
        System.out.println("Ваша задача угадать слово!");
        guessWord();
    }

    public static void guessWord() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random randWord = new Random();
        System.out.print("Напишите название фрукта, или овоща -");
        String inputWord = scanner.nextLine();
        char[] ch = new char[inputWord.length()];
        for (int i = 0; i < inputWord.length(); i++) {
            ch[i] = inputWord.charAt(i);
            int index = randWord.nextInt(words.length);
            System.out.print(ch[i] + " ");
        }
//        char[] randCh = new char[randWord.length()];
//        for (int j = 0; j < words.length; j++){
//            randCh[j] = randWord.charAt(j);
//        }
        //System.out.println(inputWord);
        // Пока не знаю как дописать код...
    }
}
