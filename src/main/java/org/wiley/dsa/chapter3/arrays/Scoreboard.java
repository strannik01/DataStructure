package org.wiley.dsa.chapter3.arrays;

public class Scoreboard {
	private int numEntries;
	private GameEntry[] board;
	
	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}
	
	public void add(GameEntry e) {
		int newScore = e.getScore();
		
		// total de entradas es menor que lo máximo permitido y el nuevo puntaje es mayor que el mínimo puntaje registrado para los máximos puntajes
		if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < board.length) 
				numEntries++;
			int j = numEntries - 1;
			while (j > 0 && board[j - 1].getScore() < newScore) {
				board[j] = board[j - 1];
				j--;
			}
			board[j] = e;
		}
	}
	
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= numEntries)
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		GameEntry temp = board[i];
		for (int j = i; j < numEntries; j++)
			board[j] = board[j + 1];
		board[numEntries - 1] = null;
		numEntries--;
		return temp;
	}

}
