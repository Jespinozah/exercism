class Hamming {

    String lefStrand, rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.lefStrand = leftStrand;
        this.rightStrand = rightStrand;
        if(this.lefStrand.length() != this.rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {

        if(this.lefStrand.isEmpty() && this.rightStrand.isEmpty())
            return 0;
        else {
                int distance = 0;
                for (int i = 0; i < lefStrand.length(); i++) {
                    if (lefStrand.charAt(i) != rightStrand.charAt(i)) {
                        distance = distance + 1;
                    }
                }
                return distance;
        }

    }

}
