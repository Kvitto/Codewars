package codewars.kyu4.morse_code_decoder;

import codewars.kyu6.morse_code_decoder.MorseCode;

public class MorseCodeDecoder {

    public static String decodeBits(String bits) {
        return ".";
    }

    public static String decodeMorse(String morseCode) {
        return MorseCode.get(morseCode);
    }
}
