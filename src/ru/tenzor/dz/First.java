package ru.tenzor.dz;

import java.util.Scanner;

public class First{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        boolean key = true;
        System.out.print("Enter card suit (Diamonds, Clubs, Spades or Hearts): ");
        String s = in.nextLine();
        System.out.print("Enter card rank: ");
        String r = in.nextLine();
        System.out.print("Number card 1 - 52: ");
        int d = in.nextInt();
        Card FirstCard = new Card(s, r);
        FirstCard.displayRankandSuit();
        FirstCard.getArray(s, r, d);
        in.close();
    }
}
