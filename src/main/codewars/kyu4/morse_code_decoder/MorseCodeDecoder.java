package codewars.kyu4.morse_code_decoder;

import codewars.kyu6.morse_code_decoder.MorseCode;

import java.util.regex.Pattern;
import java.util.regex.MatchResult;

public class MorseCodeDecoder {
    public static String decodeBits(String bits) {
        bits = bits.replaceAll("^0*|0*$", "");
        int timeUnit = Pattern.compile("0+|1+")
                .matcher(bits)
                .results()
                .map(MatchResult::group)
                .mapToInt(String::length)
                .min()
                .orElseGet(bits::length);
        return bits.replace("111".repeat(timeUnit), "-")
                .replace("000".repeat(timeUnit), " ")
                .replace("1".repeat(timeUnit), ".")
                .replace("0".repeat(timeUnit), "");
    }

    public static String decodeMorse(String morseCode) {
        String decoded = "";
        for (String word : morseCode.split(" "))
            if (word.equals("")) decoded += " ";
            else decoded += MorseCode.get(word);
        return decoded;
    }
}

/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoder {
    public static String decodeBits(String bits) {
        String trimmedBits = bits.replaceAll("^0+|0+$", "");
        int rate = getRate(trimmedBits);

        String morseCode = "";
        for (String word : trimmedBits.split("0{"+ (7 * rate) +"}")) {
            for (String letter : word.split("0{"+ (3 * rate) +"}")) {
                for (String dot : letter.split("0{" + rate + "}")) {
                    morseCode += dot.length() > rate ? '-' : '.';
                }
                morseCode += ' ';
            }
            morseCode += "  ";
        }
        return morseCode;
    }

    private static int getRate(String bits) {
        int rate = Integer.MAX_VALUE;
        Matcher matcher = Pattern.compile("1+|0+").matcher(bits);
        while (matcher.find()) {
            rate = Math.min(rate, matcher.group().length());
        }
        return rate;
    }

    public static String decodeMorse(String morseCode) {
        String decoded = "";
        for (String word : morseCode.trim().split("   ")) {
            for (String letter : word.split(" ")) {
                decoded += MorseCode.get(letter);
            }
            decoded += ' ';
        }
        return decoded.trim();
    }
}
 */
