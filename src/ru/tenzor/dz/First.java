package ru.tenzor.dz;

import java.util.Scanner;

public class First{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter card suit (Diamonds, Clubs, Spades or Hearts): ");
        String s = in.nextLine();
        System.out.print("Enter card rank: ");
        String r = in.nextLine();
        System.out.print("Number card: ");
        int d = in.nextInt();
        Card FirstCard = new Card(s, r);
        FirstCard.displayRankandSuit();
        FirstCard.getArray(s, r, d);
        System.out.print("Enter 1 to stop");
        in.close();
    }
}
