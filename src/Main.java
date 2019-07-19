public class Main {
    
    /**
     * Modulo
     */
    public static void main(String[] args){
        // Berechnen Sie den Modulowert einer Anfangszahl und einer zweiten Zahl 
        // durch die geteilt wird, d.h. den “Rest” nach dem Teilen. 
        // Beispiel 17 mod 5 = 2
        int Anfangszahl = 11;
        int Zahlzwei = 5;

        while (Anfangszahl >= Zahlzwei){
            // So lange die zweite Zahl abziehen bis nur noch der Rest uebrig bleibt
            Anfangszahl = Anfangszahl - Zahlzwei;
        }
        System.out.println(Anfangszahl);
    }
    
}
