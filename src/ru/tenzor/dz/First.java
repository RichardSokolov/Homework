package ru.tenzor.dz;

import java.util.Scanner;

public class First{
    public static void main(String args[])
    {
        int key;
        Scanner in = new Scanner(System.in);
        String[][] kolodaCard = new String[52][2];
        do {
            System.out.println("1 - Ввести карту в колоду. 2 - Выйти ");
            System.out.println("Введите номер меню: ");
            key = in.nextInt();
            in.nextLine();
            switch (key) {
                case 1:
                    System.out.print("Enter card suit (Diamonds, Clubs, Spades or Hearts): ");
                    String s = in.nextLine();
                    System.out.print("Enter card rank: ");
                    String r = in.nextLine();
                    System.out.print("Number card 1 - 52: ");
                    int d = in.nextInt();
                    Card FirstCard = new Card(s, r);
                    FirstCard.displayRankandSuit();
                    FirstCard.getArray(s, r, d, kolodaCard, FirstCard);
                    break;
                case 2:
                    System.out.println("Завершение программы...");
                    break;
                default:
                    System.out.println("Вы ввели неверное значение меню...\n");
            }
        }
        while(key != 2);
        in.close();
    }
}
