package codewars.kyu6.morse_code_decoder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   ")).map(MorseCodeDecoder::decoding).collect(Collectors.joining(" "));
    }

    static String decoding(String morseCode) {
        return Arrays.stream(morseCode.split(" ")).map(MorseCode::get).collect(Collectors.joining());
    }
}
