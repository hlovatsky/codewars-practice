package seven;

public class GetMiddleChar {

    public String getMidChar(String word) {
        int mid = 0;
        String middleChar;
        if (word.length() % 2 == 1 && word.length() > 1) {
            mid = word.length() / 2;
            middleChar = String.valueOf(word.charAt(mid));
        } else if (word.length() == 1) {
            middleChar = String.valueOf(word.charAt(mid));
        } else {
            mid = word.length() / 2 - 1;
            middleChar = String.valueOf(word.charAt(mid)) + word.charAt(mid + 1);
        }
        return middleChar;
    }
}
