package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildrensPriceTest {

    @Test
    void getCharge() {
        ChildrensPrice c = new ChildrensPrice();
        assertEquals(1.5, c.getCharge(1));
        assertEquals(3, c.getCharge(4));
        assertThrows(IllegalArgumentException.class,()->c.getCharge(-9999999));
        assertThrows(IllegalArgumentException.class,()->c.getCharge(0));
        assertThrows(IllegalArgumentException.class,()->c.getCharge(33));
    }

    @Test
    void getPriceCode() {
        ChildrensPrice c = new ChildrensPrice();
        assertEquals(2,c.getPriceCode());
    }
}