public class Main {
    
    /**
     * Modulo
     */
    public static void main(String[] args){
        // Berechnen Sie den Modulowert einer Anfangszahl und einer zweiten Zahl 
        // durch die geteilt wird, d.h. den “Rest” nach dem Teilen. 
        // Beispiel 17 mod 5 = 2
        int zahl1; 
        int zahl2; 
        int durchlauf = 0;
        
        zahl1 = 17;
        zahl2 = 5;
        
        System.out.println("Erste Zahl: " + zahl1 + " Zweite Zahl: " + zahl2);
        
        while(zahl1 >= zahl2)
        {
            zahl1 = zahl1 - zahl2;
            durchlauf += 1;
        }
         System.out.println("Restwert: " + zahl1);
         System.out.println("Durchlauf:efw " + durchlauf);
    }
    
}
