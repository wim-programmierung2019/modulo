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
        int Modulowert;
        
        while (Anfangszahl>= Zahlzwei){
        Anfangszahl = Anfangszahl - Zahlzwei;}
        System.out.println(Anfangszahl);
    }
    
}
