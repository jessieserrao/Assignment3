package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultPriceTest {

    @Test
    void getCharge() {
        AdultPrice adultPrice = new AdultPrice();
        assertEquals(5, adultPrice.getCharge(1));
        assertEquals(8, adultPrice.getCharge(2));
    }

    @Test
    void getPriceCode() {
        AdultPrice adultPrice = new AdultPrice();
        assertEquals(3,adultPrice.getPriceCode());
    }
}