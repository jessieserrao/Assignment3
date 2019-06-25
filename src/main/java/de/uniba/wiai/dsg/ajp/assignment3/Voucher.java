package de.uniba.wiai.dsg.ajp.assignment3;

import java.util.Random;
//Hier habe ich Zufallszahlen für 3 Vouchertypen mit 3, 4 und 5 stellige Nummer. Allerdings die Werte der Vouchers konnte ich nicht zuordnen.
// Wenn du das machen kannst bro, hätten wir die Voucher Classe auch dabei. Diese soll eigentlich von den Total Price abgezogen werden.
//Telefonisch bin ich zu erreichen unter: 0176-81929902
public class Voucher {

    public static void VoucherCode() {
        Random code = new Random();
        int x = code.nextInt(999)+100;
        int y = code.nextInt(9999)+1000;
        int z = code.nextInt(99999)+10000;


    }

    public static int VoucherValue() {

        int x = 20;
        int y = 30;
        int z = 50;

        if (code.nextInt >=100 & code.nextInt <=999) {





            return 0;


        }
    }
}