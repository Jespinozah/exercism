public class PangramChecker {

    public boolean isPangram(String input) {
        String temp = input.toLowerCase();
        int NO_OF_LETTERS_OF_ALPHABET = 26;
        if(temp.length() < NO_OF_LETTERS_OF_ALPHABET)
            return false;
        for(char cha = 'a'; cha <= 'z'; cha++) {
            if(temp.indexOf(cha) < 0)
                return false;
        }
        return true;
    }

}
