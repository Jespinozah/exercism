class ReverseString {

    String reverse(String inputString) {
        String temp ="";
        if (inputString.isEmpty())
            return temp;
        else {
            for(int i = inputString.length() - 1; i >= 0; i--){
                temp = temp + inputString.charAt(i);
            }
            return temp;
        }

    }
  
}