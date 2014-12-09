import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n Namen einlesen und den k�rzesten und l�ngsten Namen ausgeben
// GitHub Testkommentar

public class A_Einlesen {
    public static void main(String[] args) throws IOException {
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

        String namen[];
        String eingabe;
        int n, stelleKurz = 0, stelleLang = 0;
        String kurz, lang;

        System.out.println(">>>Array-Eingabe<<<");
        System.out.println();
        System.out.println("Gib gew�nschte Anzahl der Namen zum Eingeben: ");
        eingabe = tastatur.readLine();
        n = Integer.parseInt(eingabe);

        namen = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Gib Name (" + (i + 1) + "):");
            namen[i] = tastatur.readLine();
        }

        kurz = namen[0];
        lang = namen[0];

        for (int i = 1; i < n; i++) {
            if (namen[i].length() < kurz.length()) {
                kurz = namen[i];
                stelleKurz = i;
            } else if (namen[i].length() > lang.length()) {
                lang = namen[i];
                stelleLang = i;
            }
        }
        System.out.println("Der k�rzeste Name befindet sich an " + (stelleKurz + 1) + ". Stelle und lautet: " + kurz);
        System.out.println("Der l�ngste Name befindet sich an " + (stelleLang + 1) + ". Stelle und lautet:  " + lang);
    }
}
