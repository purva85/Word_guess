package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.GameLogic;

public class WordGuessTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameLogic game = new GameLogic(6); 

        System.out.println("Welcome to the Word Guess Game.");

        while (game.hasLivesLeft() && !game.isWordGuessed()) {
            System.out.println("\nWord: " + game.getGuessedWordAsString());
            System.out.println("Lives left: " + game.getLives());
            System.out.print("Guess a letter: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.isEmpty()) {
                System.out.println("Please enter a letter!");
                continue;
            }

            char guess = input.charAt(0);

            boolean correct = game.guessLetter(guess);
            if (correct) {
                System.out.println("Good guess!");
            } else {
                System.out.println("Wrong guess! You lost a life.");
            }
        }

        if (game.isWordGuessed()) {
            System.out.println("\nCongratulations! You guessed the word: " + game.getWordToGuess());
        } else {
            System.out.println("\nGame Over! The word was: " + game.getWordToGuess());
        }

        scanner.close();
    }
}

