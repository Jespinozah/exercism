import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binary = Integer.toBinaryString(number);
        List<Signal> listSignal = new ArrayList<>();
        List<Signal> signals = new ArrayList<>();
        signals.add(Signal.JUMP);
        signals.add(Signal.CLOSE_YOUR_EYES);
        signals.add(Signal.DOUBLE_BLINK);
        signals.add(Signal.WINK);

        int j = 0, min =0;


        if (binary.length() == 5) {
            min = 1;
        }

        for (int i = binary.length(); i > min; i--) {
            if(binary.charAt(i - 1) == '1'){
                listSignal.add(signals.get( 3 - j));

            }
            j++;
        }

        if(min  == 1) {
            Collections.reverse(listSignal);
        }
        return listSignal;
    }

}
