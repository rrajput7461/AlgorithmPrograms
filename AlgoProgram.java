import java.util.Arrays;
public class AlgoProgram {
    public static boolean search(String[] words, String key) {
        Arrays.sort(words);
        int low = 0, high = words.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (words[mid].equalsIgnoreCase(key))
                return true;
            else if (words[mid].compareToIgnoreCase(key) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
