package pincode_OOP;

import java.util.Scanner;


public class Felhasznalo {
    private String pin;
    private int probalkozasok;

    public Felhasznalo(String pin) {
        this.pin = pin;
        this.probalkozasok = 3;
        pinBeker();
    }
    

    private void pinBeker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy 4 számjegyű PIN-kódot: ");
        String megadottPin;

            megadottPin = scanner.nextLine();
        

    }
    // kell meg egy kulon eltarolas funkcio 
    
    
    
}
