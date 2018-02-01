class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        String upperCasePhrase = phrase.toUpperCase();
        String[] splitPhrase = upperCasePhrase.split(" |-");
        for(int i = 0; i < splitPhrase.length; i++) {
            acronym.append(splitPhrase[i].charAt(0));
        }
        return acronym.toString();
    }

}
