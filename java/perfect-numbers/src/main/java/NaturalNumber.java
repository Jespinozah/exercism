class NaturalNumber {
    int number;

    NaturalNumber(int number) {
            if (number <= 0) {
                throw new IllegalArgumentException("You must supply a natural number (positive integer)");
            }
        this.number = number;
    }

    Classification getClassification() {
        int count = 1;
        int sum = 0;
        while (count <= number/2) {
            if( number % count == 0){
                sum = sum + count;
            }
            count ++;
        }

        if ( sum*sum == number*number) {
            return Classification.PERFECT;
        } else if (sum*sum < number*number) {
            return Classification.DEFICIENT;
        } else {
            return Classification.ABUNDANT;
        }

    }

}
