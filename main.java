package com.company;

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Deck d1 = deck.subdeck(0,26);
        Deck d2 = deck.subdeck(26,51);
        Deck merged = deck.mergeSort();
//        deck.selectionSort();
        System.out.println(deck);
        int indexLowest = deck.indexLowest(0,52);
        System.out.println(indexLowest);
    }
}
