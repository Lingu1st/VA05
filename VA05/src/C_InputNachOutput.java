// 
public class C_InputNachOutput {
    public static void main(String[] args) {

        int[] input = { 5, 1, 6, 3, 2, 4, 7, 9, 10, 13, 15, 17 };
        int output[] = new int[input.length];
        boolean fertig = false;
        int inLen, outLen, minIndex, min = 0;

        inLen = input.length;
        outLen = 0;

        System.out.println("input    -->     output");

        while (!fertig) {
            // Ausgeben des momentanen Zustandes:
            System.out.print("( ");
            for (int i = 0; i < inLen; i++) {
                System.out.print(input[i] + " ");
            }
            System.out.print(") --> ( ");
            for (int i = 0; i < outLen; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println(")");

            if (inLen == 0) {
                fertig = true;
            } else {
                // es gilt: inLen > 0 , dh. noch was da
                // Finden und Extrahieren der Stelle mit dem Minimum:
                minIndex = 0;
                for (int i = 0; i < inLen; i++) {
                    if (input[i] < input[minIndex]) {
                        minIndex = i;
                    }
                }
                min = input[minIndex];
                // "Luecke" im Input schließen:
                for (int i = minIndex; i < inLen - 1; i++) {
                    input[minIndex] = input[minIndex + 1];
                    minIndex++;
                }
                inLen--;
                // Einfuegen dieses Datums in den Output:
                output[outLen] = min;
                outLen++;
            }
        }
    }
}
