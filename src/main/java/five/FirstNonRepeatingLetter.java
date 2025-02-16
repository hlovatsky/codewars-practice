package five;

/*
https://www.codewars.com/kata/52bc74d4ac05d0945d00054e
 */
public class FirstNonRepeatingLetter {

    public Character firstNonRepeatingLetter(String word) {
        String wordToLowerCase = word.toLowerCase();

        for (int i = 0; i < wordToLowerCase.length(); i++) {
            char c = wordToLowerCase.charAt(i);
            if (wordToLowerCase.indexOf(Character.toLowerCase(c)) == wordToLowerCase.lastIndexOf(Character.toLowerCase(c))) {
                return c;
            }
        }
        return 0;
    }
}