package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWorkTest {

    HomeWork homeWork = new HomeWork();
    private final static String TROLOLO_ENCODED = "- .-. --- .-.. --- .-.. --- / .-.. --- .-. . -- / .. .--. ... ..- -- / -.. --- .-.. --- .-. / ... .. - / .- -- . -";
    private final static String TROLOLO_DECODED = "trololo lorem ipsum dolor sit amet";

    @Test
    void decodeTest() {
        assertEquals("hello world", homeWork.morseTranslator().decode(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
        assertEquals(TROLOLO_DECODED, homeWork.morseTranslator().decode(TROLOLO_ENCODED));
    }
    @Test
    void encodeTest() {
        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -..", homeWork.morseTranslator().encode("hello world"));
        assertEquals(TROLOLO_ENCODED, homeWork.morseTranslator().encode(TROLOLO_DECODED));
    }
}