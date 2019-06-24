package de.uniba.wiai.dsg.ajp.assignment3;

public class AdultPrice extends Price {
    @Override
    double getCharge(int daysRented) {

        double result = 5;
        if (daysRented > 1) {
            result += daysRented * 1.5;
        }
        return result;
    }

    @Override
    int getPriceCode() {

        return Movie.PriceCode.ADULT.getValue();
    }


}
