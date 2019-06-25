package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularPriceTest {
            RegularPrice regularPrice = new RegularPrice();
    @Test
    void getCharge() {
        assertEquals(2, 2, regularPrice.getCharge(1) );
        assertEquals(2, 2, regularPrice.getCharge(2) );
        assertEquals(1, 1, regularPrice.getCharge(3) );
    }

    @Test
    void getPriceCode() {
        RegularPrice regularPrice = new RegularPrice();
        assertEquals(0, regularPrice.getPriceCode());
    }
}