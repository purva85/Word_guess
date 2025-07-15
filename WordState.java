package com.aurionpro.model;


public class WordState {
    private String wordToGuess;
    private char[] guessedWord;

    public WordState(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
    }

    public boolean updateWithGuess(char letter) {
        boolean found = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter && guessedWord[i] == '_') {
                guessedWord[i] = letter;
                found = true;
            }
        }
        return found;
    }

    public boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == '_') return false;
        }
        return true;
    }

    public String getGuessedWordAsString() {
        return String.valueOf(guessedWord);
    }

    public String getWordToGuess() {
        return wordToGuess;
    }
}
