package com.aurionpro.model;
import java.util.Random;



public class GameLogic implements IGame {
    private int lives;
    private WordState wordState;

    public GameLogic(int lives) {
        this.lives = lives;
        WordPicker picker = new WordPicker();
        String word = picker.pickWord();
        this.wordState = new WordState(word);
    }

    @Override
    public boolean guessLetter(char letter) {
        boolean correct = wordState.updateWithGuess(letter);
        if (!correct) {
            lives--;
        }
        return correct;
    }

    @Override
    public boolean isWordGuessed() {
        return wordState.isWordGuessed();
    }

    @Override
    public boolean hasLivesLeft() {
        return lives > 0;
    }

    @Override
    public int getLives() {
        return lives;
    }

    @Override
    public String getGuessedWordAsString() {
        return wordState.getGuessedWordAsString();
    }

    @Override
    public String getWordToGuess() {
        return wordState.getWordToGuess();
    }
}
