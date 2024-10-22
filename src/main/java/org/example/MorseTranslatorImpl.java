package org.example;

import java.util.StringJoiner;

public class MorseTranslatorImpl implements MorseTranslator {
    /**
     * Расшифровка кода Морзе
     *
     * @param morseCode
     * @return
     */
    @Override
    public String decode(String morseCode) {
        StringJoiner wordJoiner = new StringJoiner(" ");

        for (String word : morseCode.toLowerCase().split(" / ")) {
            StringBuilder builder = new StringBuilder();
            for (String letter : word.split(" ")) {
                builder.append(EnglishMorseCode.decode(letter));
            }
            wordJoiner.add(builder);
        }

        return wordJoiner.toString();
    }

    /**
     * Шифрование кодом Морзе
     *
     * @param source
     * @return
     */
    @Override
    public String encode(String source) {
        StringJoiner wordJoiner = new StringJoiner(" / ");

        for (String word : source.split(" ")) {
            StringJoiner letterJoiner = new StringJoiner(" ");
            for (char letter : word.toCharArray()) {
                String encode = EnglishMorseCode.encode(String.valueOf(letter));
                letterJoiner.add(encode);
            }

            wordJoiner.add(letterJoiner.toString());
        }

        return wordJoiner.toString();
    }
}
