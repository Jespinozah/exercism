import java.util.HashMap;

class Scrabble {
    String word;
    int score;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {

        HashMap<Character, Integer> letterScore = new HashMap();
        letterScore.put('A',1);
        letterScore.put('E',1);
        letterScore.put('I',1);
        letterScore.put('O',1);
        letterScore.put('U',1);
        letterScore.put('L',1);
        letterScore.put('N',1);
        letterScore.put('R',1);
        letterScore.put('S',1);
        letterScore.put('T',1);

        letterScore.put('D',2);
        letterScore.put('G',2);

        letterScore.put('B',3);
        letterScore.put('C',3);
        letterScore.put('M',3);
        letterScore.put('P',3);

        letterScore.put('F',4);
        letterScore.put('H',4);
        letterScore.put('V',4);
        letterScore.put('W',4);
        letterScore.put('Y',4);

        letterScore.put('K',5);

        letterScore.put('J',8);
        letterScore.put('X',8);

        letterScore.put('Q',10);
        letterScore.put('Z',10);

        for (int i = 0; i < word.length(); i++) {
            score = letterScore.get(Character.toUpperCase(word.charAt(i))) + score;
        }

        return score;
    }

}
