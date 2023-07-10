package com.dio.exercicios2;

public class Ex_Card {
	private int rank;
	private int suit;

	// kinds of suits
	public final static int DIAMONDS = 1;
	public final static int CLUBS = 2;
	public final static int HEARTS = 3;
	public final static int SPADES = 4;

	// kinds of ranks
	public final static int ACE = 1;
	public final static int DEUCE = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;

	Ex_Card(int rank, int suit) {
		if(!checkSuit(suit) || !checkRank(rank)) {
			System.out.println("Suit or/and rank not available!");
			return;
		}
		this.rank = rank;
		this.suit = suit;
	}

	public static boolean checkSuit(int suit) {
		return suit >= 1 && suit <= 4;
	}

	public static boolean checkRank(int rank) {
		return rank >= 1 && rank <= 13;
	}
}