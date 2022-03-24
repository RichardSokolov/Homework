package ru.tenzor.dz;

import java.util.Scanner;

public  class Card {
    private static String suit;
    private static String rank;
    public static int schet;
    public static int ischet;
    public static int jschet;
    public Card() { //конструктор по умолчанию
        String suit = "Diamonds";
        String rank = "Jack";
    }
    public Card(String s, String r) {
        if (s.equals("Diamonds")||s.equals("Clubs")||s.equals("Spades")||s.equals("Hearts")
                ||s.equals("diamonds")||s.equals("clubs")||s.equals("spades")||s.equals("hearts")) //Проверка масти
        {
            suit = s;
            rank = r;

        }
        else
        {
            if (s.equals("")||r.equals("")) { //Если значения масти и ранк карты пусты им присваивается значение по умолчанию
                suit = "Diamond";
                rank = "Queen";
            }
            else {// Ошибка в случае неверно введеной масти
                suit = "Incorrect suit!";
                rank = r;
                System.out.print("Error: ");
            }
        }
    }
    public String getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }
    public static String getArray(String s, String r, int d) {
        String[][] kolodaCard = new String[52][2];
        /*for (int i = ischet; i < schet - 1; i++) {
            for (int j = jschet; j < 2; j++) {
                kolodaCard[i][0] = suit;
                kolodaCard[i][j] = rank;
                jschet++;
            };
            ischet++;

        }*/
        kolodaCard[d-1][0]=suit;
        kolodaCard[d-1][1]=rank;
        for (int i = 0; i < 52; i++) {  //идём по строкам
            for (int j = 0; j < 2; j++) {//идём по столбцам
                System.out.print(" " + kolodaCard[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        return suit;
    }
    public void displayRankandSuit() {
        System.out.printf(suit);
        System.out.print(", ");
        System.out.printf(rank);
        System.out.print("\n");
    }
}
