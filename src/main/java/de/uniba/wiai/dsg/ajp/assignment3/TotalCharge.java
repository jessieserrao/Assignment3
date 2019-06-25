package de.uniba.wiai.dsg.ajp.assignment3;
/**
 *
 Hier habe ich nicht geschafft, den Gutschein von der Preis abzuziehen. Der Mehrwertsteuer konnte nicht programmiert werden,
 wie wir es besprochen haben ----> x = 18%, y=19%, z = 20% weil diese nicht konstante ist und mit Setter müsste konfiguriert werden.
 Leider habe ich das nicht geschafft.
 */

import java.util.LinkedList;
import java.util.List;

public class TotalCharge extends Price {

    @Override
    double getCharge(int daysRented) {

        Validator.validateDaysRented(daysRented);

        return daysRented;
    }

    @Override
    int getPriceCode() {

        Validator.validategetPriceCode(getPriceCode());

        return getPriceCode();
    }

    private List<Rental> rentals = new LinkedList<Rental>();


    public double Sum() {

        double result = 0;

        for (Rental each : rentals) {
            result += each.getCharge();

        }
        return result;

    }
}