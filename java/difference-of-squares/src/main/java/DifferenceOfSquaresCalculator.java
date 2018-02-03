class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int result = 0;
        for (int i = input; i > 0; i--) {
            result = i + result;
        }
        return result*result;
    }

    int computeSumOfSquaresTo(int input) {
        int result = 0;
        for (int i = input; i > 0; i--) {
            result = i*i + result;
        }
        return result;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
