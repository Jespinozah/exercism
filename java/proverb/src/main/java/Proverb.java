class Proverb {

    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {

        String resultProverb = "";
        if (words.length == 0){
            return resultProverb;
        } else {
            String resultAll = "And all for the want of a " + words[0] +".";
            if (words.length == 1) {
                return resultAll;
            } else {
                for (int i = 0; i < words.length - 1; i++) {
                    resultProverb = resultProverb + "For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n";
                }
            }
            resultProverb = resultProverb + resultAll;
        }
        return resultProverb;

    }

}
