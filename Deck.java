package com.company;

import java.util.Arrays;
import java.util.Random;

    /**
     * A deck of playing cards (of fixed size).
     */
    public class Deck {
        private Card[] cards;

        /**
         * Constructs a standard deck of 52 cards.
         */
        public Deck() {
            this.cards = new Card[52];
            int index = 0;
            for (int suit = 0; suit <= 3; suit++) {
                for (int rank = 1; rank <= 13; rank++) {
                    this.cards[index] = new Card(rank, suit);
                    index++;
                }
            }
        }

        /**
         * Constructs a deck of n cards (null).
         */
        public Deck(int n) {
            this.cards = new Card[n];
        }

        /**
         * Gets the internal cards array.
         */
        public Card[] getCards() {
            return this.cards;
        }

        /**
         * Displays each of the cards in the deck.
         */
        public void print() {
            for (int i = 0; i < this.cards.length; i++) {
                System.out.println(this.cards[i]);
            }
        }

        /**
         * Returns a string representation of the deck.
         */
        public String toString() {
            return Arrays.toString(this.cards);
        }

        /**
         * Chooses a random number between low and high, including both.
         */
        public int randomInt(int low, int high) {
            Random random = new Random();
            int diff = high - low + 1;
            int r = random.nextInt(diff) + low;
            return r;
        }

        /**
         * Swaps the cards at indexes i and j.
         */
        public void swapCards(int i, int j) {
            Card tempCard = null;
            tempCard = this.cards[i];
            this.cards[i] = this.cards[j];
            this.cards[j] = tempCard;
        }

        /**
         * Randomly permutes the array of cards.
         */
        public void shuffle() {
            int highElem = this.cards.length - 1;
            for (int i = 0; i <= highElem; i++) {
                int rand = randomInt(i,highElem);
                swapCards(i,rand);
            }
        }

        /**
         * Finds the index of the lowest card
         * between low and high inclusive.
         */
        public int indexLowest(int low, int high) {
            Card minCard = this.cards[low];
            int index = low;
            int size = high - low;
            for (int i = low; i < size; i++) {
                int comp = this.cards[i].compareTo(minCard); //if any card from the aray is lower than minCart returns -1
                if (comp == -1 || comp == 0) {
                    minCard = this.cards[i];
                    index = i;
                }
            }
            return index;
        }

        /**
         * Sorts the cards (in place) using selection sort.
         */
        public void selectionSort() {
            int size = this.cards.length;
            for (int i = 0; i < size; i++) {
                int lowest = indexLowest(i, size);
                swapCards(i, lowest);
            }
        }

        /**
         * Returns a subset of the cards in the deck.
         */
        public Deck subdeck(int low, int high) {
            Deck sub = new Deck(high - low + 1);
            for (int i = 0; i < sub.cards.length; i++) {
                sub.cards[i] = this.cards[low + i];
            }
            return sub;
        }

        /**
         * Combines two previously sorted subdecks.
         */
        public static Deck merge(Deck d1, Deck d2) {
            Deck deck = new Deck();
            int deckSize = deck.cards.length;
            int subDeckSize = d1.cards.length;
            for (int j = 0; j < subDeckSize; j++) {
                    deck.cards[j] = d1.cards[j];
                }
            for (int i = 0; i < subDeckSize ; i++) {
                deck.cards[subDeckSize] = d2.cards[i];
                subDeckSize++;
            }
            return deck;
        }

        /**
         * Returns a sorted copy of the deck using merge sort.
         */
        public Deck mergeSort() {
            return this;
        }

        /**
         * Reorders the cards (in place) using insertion sort.
         */
        public void insertionSort() {
        }

    }
