// Doppelte Strings ausgeben

public class B_Reiseziele {
    public static void main(String[] args) {
        String[] liste = { "Moritzkirche", "Baggersee", "THI", "Klenzepark", "Audi Forum", "Kreuztor", "Herzogskasten",
                "Neues Schloss", "THI", "Alte Anatomie", "Armeemuseum", "Audi", "Ingolstadt Village", "Auwaldsee", "Audi" };
        boolean test = true;

        for (int i = 0; i < liste.length; i++) {
            System.out.println((i + 1) + ") " + liste[i]);
        }
        System.out.println("Ueberpruefung:");
        for (int i = 0; i < liste.length; i++) {
            for (int j = i; j < liste.length; j++) {
                if (liste[i].equals(liste[j]) && i != j) {
                    System.out.println("doppelt ist \"" + liste[i] + "\", an Stelle " + (i + 1) + " und Stelle " + (j + 1));
                    test = false;
                }
            }
        }
        if (test) {
            System.out.println("Es existieren keine doppelten Elemente in der String-Reihung");
        }
    }

}
