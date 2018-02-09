import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        ArrayList proteins = new ArrayList();
        for (int i = 0; i < rnaSequence.length() - 2; i += 3) {
            String temp = rnaSequence.substring(i,3 + i);

            if (temp.equals("AUG")) {
                proteins.add("Methionine");
            }
            if (temp.equals("UUU") | temp.equals("UUC")) {
                proteins.add("Phenylalanine");
            }
            if (temp.equals("UUA") | temp.equals("UUG")) {
                proteins.add("Leucine");
            }
            if (temp.equals("UCU") | temp.equals("UCC") | temp.equals("UCA") | temp.equals("UCG")){
                proteins.add("Serine");
            }
            if (temp.equals("UAU") | temp.equals("UAC")) {
                proteins.add("Tyrosine");
            }
            if (temp.equals("UGU") | temp.equals("UGC")) {
                proteins.add("Cysteine");
            }
            if (temp.equals("UGG")) {
                proteins.add("Tryptophan");
            }
            if (temp.equals("UAA") | temp.equals("UAG") | temp.equals("UGA")) {
                break;
            }
            }
            return proteins;
        }
}
