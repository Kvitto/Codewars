package codewars.kyu6.find_missing_letter;

public class Kata {
    public static char findMissingLetter(char[] array) {
        byte b = (byte) array[0];
        for (int i = 1; i < array.length; i++) {
            if (b + i != (byte) array[i]) return (char) (b + i);
        }
        return ' ';
    }
}
