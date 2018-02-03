class RaindropConverter {

    String convert(int number) {
        StringBuilder raindropConversion = new StringBuilder();
        if ( number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            if ((number % 3) == 0) {
                raindropConversion.append("Pling");
            }
            if ((number % 5) == 0) {
                raindropConversion.append("Plang");
            }
            if ((number % 7) == 0) {
                raindropConversion.append("Plong");
            }
            return raindropConversion.toString();
        } else {
            return String.valueOf(number);
        }
    }

}
