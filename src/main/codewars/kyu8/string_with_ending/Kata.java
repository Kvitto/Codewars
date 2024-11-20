package codewars.kyu8.string_with_ending;

public class Kata {
    // My variant
    public static boolean solution(String str, String ending) {
        if (str.length() < ending.length()) return false;
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    // Best practice
//    public static boolean solution(String str, String ending) {
//        return str.endsWith(ending);
//    }

}
