public class AlgoProgram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        boolean[] matched = new boolean[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j) && !matched[j]) {
                    matched[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }
}
