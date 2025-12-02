package U2T6;

public class StringLoops {
    public StringLoops() { }

    public int countCharacters(String character, String searchString) {
        int count = 0;

        String charLower = character.toLowerCase();
        String wordLower = searchString.toLowerCase();

        for (int i = 0; i < wordLower.length(); i++) {
            if (wordLower.substring(i, i + 1).equals(charLower)) {
                count++;
            }
        }

        return count;
    }

    public String reverseString(String origString) {
        String result = ""; 
        for (int x = origString.length() - 1; x >= 0; x--) {
            result += origString.substring(x, x + 1); 
        }
        return result; 
    }

}


