package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewReleasePriceTest {
    NewReleasePrice adultPrice = new NewReleasePrice();
    @Test
    void getCharge() {

        assertEquals(3, adultPrice.getCharge(1));
        assertEquals(6, adultPrice.getCharge(2));
    }

    @Test
    void getFrequentRenterPoints() {
        assertEquals(1, 1, adultPrice.getFrequentRenterPoints(1));
        assertEquals(2, 2, adultPrice.getFrequentRenterPoints(2));
    }

    @Test
    void getPriceCode() {
        assertEquals(1, 1, adultPrice.getPriceCode());
    }
}