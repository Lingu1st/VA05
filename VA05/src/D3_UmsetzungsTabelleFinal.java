import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_UmsetzungsTabelleFinal {
    public static void main(String[] args) throws IOException {
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

        String[] umsetzungsTabelle = { "4", "ß", "(", "|]", "3", "ph", "6", "|-|", "1", "_|", "|<", "1", "|V|", "/V", "0", "/o",
                "O_", "|2", "$", "7", "|_|", "\\/", "VV", "%", "´/", "7_", "4", "ß", "(", "|]", "3", "ph", "6", "|-|", "1", "_|",
                "|<", "1", "|V|", "/V", "0", "/o", "O_", "|2", "$", "7", "|_|", "\\/", "VV", "%", "´/", "7_", "°A°", "°0°",
                "°U°", "°A°", "°0°", "°U°", "!!11einseinself", " ", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "zero" };
        String indexTabelle = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÄÖÜäöü! 1234567890";
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
            if (platzNr == -1) {
                System.out.print("<?>");
            } else {
                System.out.print(umsetzungsTabelle[platzNr]);
            }
        }
    }

}
