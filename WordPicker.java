package com.aurionpro.model;

import java.util.Random;

public class WordPicker {
    private String[] words = {"pen", "book", "cake", "knife", "melon"};

    public String pickWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}