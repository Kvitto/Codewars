package codewars.kyu4.permutations;

import java.util.*;

class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<String> set = new HashSet<>();
        if (s.length() == 1) {
            set.add(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                List<String> temp = singlePermutations(s.substring(0, i) + s.substring(i + 1));
                for (String string : temp) {
                    set.add(s.charAt(i) + string);
                }
            }
        }
        return new ArrayList<>(set);
    }


//    public static List<String> singlePermutations(String s) {
//        System.out.println(s);
//        if (s.isBlank()) return null;
//        Set<String> res = new HashSet<>(shuffle(s));
//        return new ArrayList<>(res);
//    }
//
//    private static List<String> shuffle(String str) {
//        int length = str.length();
//        if (length <= 1) return List.of(str.split(""));
//        if (length == 2) {
//            String substring = str.substring(length - 2);
//            return List.of(substring, new StringBuilder(substring).reverse().toString());
//        }
//        List<String> res = new ArrayList<>();
//        String[] split = str.split("");
//        for (int i = 0; i < split.length; i++) {
//            String a = split[i];
//            String sub = str.substring(0, i) + str.substring(i + 1);
//            for (String b : shuffle(sub)) {
//                res.add(a + b);
//            }
//        }
//        return res;
//    }
}
