class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result= "";
        for(int i=0; i< dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G' )
                result = result + "C";
            if (dnaStrand.charAt(i) == 'C' )
                result = result + "G";
            if (dnaStrand.charAt(i) == 'T' )
                result = result + "A";
            if (dnaStrand.charAt(i) == 'A' )
                result = result + "U";
        }
        return result;
    }

}
