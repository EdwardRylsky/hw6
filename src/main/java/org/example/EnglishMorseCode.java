package org.example;

import java.util.Map;

import static java.util.Map.entry;

public class EnglishMorseCode {
    private static final Map<String, String> ALPHABET = Map.ofEntries(entry("a",".-"),
            entry("b", "-..."),
            entry("c", "-.-."),
            entry("d", "-.."),
            entry("e", "."),
            entry("f", "..-."),
            entry("g", "--."),
            entry("h", "...."),
            entry("i", ".."),
            entry("j", ".---"),
            entry("k", "-.-"),
            entry("l", ".-.."),
            entry("m", "--"),
            entry("n", "-."),
            entry("o", "---"),
            entry("p", ".--."),
            entry("q", "--.-"),
            entry("r", ".-."),
            entry("s", "..."),
            entry("t", "-"),
            entry("u", "..-"),
            entry("v", "...-"),
            entry("w", ".--"),
            entry("x", "-..-"),
            entry("y", "-.--"),
            entry("z", "--.."));


    public static String encode(String text) {
        return ALPHABET.get(text);
    }

    public static String decode(String text) {
        for (Map.Entry<String, String> entry : ALPHABET.entrySet()) {
            if (entry.getValue().equals(text)) {
                return entry.getKey();
            }
        }

        throw new IllegalArgumentException("Unknown code " + text);
    }
}