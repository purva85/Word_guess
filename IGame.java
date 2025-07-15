package com.aurionpro.model;

public interface IGame {
    boolean guessLetter(char letter);
    boolean isWordGuessed();
    boolean hasLivesLeft();
    int getLives();
    String getGuessedWordAsString();
    String getWordToGuess();
}
