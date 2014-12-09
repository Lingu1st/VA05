import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1_UmsetzungsTabelleAbisE {
    public static void main(String[] args) throws IOException {
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

        String[] umsetzungsTabelle = { "ah", "bae", "dsae", "dae", "ae-y" };
        String indexTabelle = "ABCDE";
        String eingabe;
        char x;
        int platzNr;

        System.out.println(">>>Mein erstes Uebersetzungsprogramm<<<");
        System.out.println();
        System.out.print("Gib Satz: ");
        eingabe = tastatur.readLine();

        System.out.print("Uebersetzung: ");
        
        for (int i = 0; i < eingabe.length(); i++) {
            x = eingabe.charAt(i);
            platzNr = indexTabelle.indexOf(x);
            System.out.print(umsetzungsTabelle[platzNr]);
        }
    }

}
