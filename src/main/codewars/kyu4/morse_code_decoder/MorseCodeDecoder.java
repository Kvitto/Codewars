package codewars.kyu4.morse_code_decoder;

import codewars.kyu6.morse_code_decoder.MorseCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    static int rate;

    public static String decodeBits(String bits) {
        rate = 100;
        return bitSplit(bits).stream().map(MorseCodeDecoder::convert).collect(Collectors.joining());
    }

    public static String decodeMorse(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   ")).map(MorseCodeDecoder::decoding).collect(Collectors.joining(" "));
    }

    static String decoding(String morseCode) {
        return Arrays.stream(morseCode.split(" ")).map(MorseCodeDecoder::morseCodeDecor).collect(Collectors.joining());
    }

    static String convert(String s) {
        String sub = s.substring(0, s.length()/ rate);
        return switch (sub) {
            case "0000000":
                yield "   ";
            case "000":
                yield " ";
            case "111":
                yield "-";
            case "1":
                yield ".";
            default:
                yield "";
        };
    }

    static LinkedList<String> bitSplit(String bits) {
        LinkedList<String> list = new LinkedList<>();
        char[] bitsChars = bits.toCharArray();
        char[] bitsWords = new char[bitsChars.length];
        char previewChar = bitsChars[0];
        int count = 0;
        for (char bitsChar : bitsChars) {
            if (count == 0 && bitsChar == '0') continue;
            if (previewChar != bitsChar) {
                if (count > 0 && count < rate) {
                    rate = count;
                }
                list.add(String.valueOf(Arrays.copyOf(bitsWords, count)));
                bitsWords = new char[bitsChars.length];
                previewChar = bitsChar;
                bitsWords[0] = previewChar;
                count = 1;
            } else {
                bitsWords[count++] = bitsChar;
            }
        }
        String lastStr = String.valueOf(Arrays.copyOf(bitsWords, count));
        if (lastStr.matches("[1]+")) list.add(lastStr);
        if (rate == 100) {rate = list.stream().filter(s -> s.matches("[1]+")).findAny().map(String::length).orElse(1);}
        return list;
    }

    static String morseCodeDecor(String s) {
        return s.contains(".-.-.-") ? "." : MorseCode.get(s);
    }
}
