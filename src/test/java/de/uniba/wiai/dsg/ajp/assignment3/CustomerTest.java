package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = mock(Customer.class);
        customer.setName("Max Mus");
        assertEquals("Max Mus",customer.getName());
    }

    @Test
    void setName() {
        Customer customer = new Customer("notMax M");

        customer.setName("Max Mustermann");
        assertEquals("Max Mustermann",customer.getName());

        assertThrows(NullPointerException.class,()->customer.setName(null));
        assertThrows(IllegalArgumentException.class,()->customer.setName("1234 FF"));
        assertThrows(IllegalArgumentException.class,()->customer.setName(""));
        assertThrows(IllegalArgumentException.class,()->customer.setName("@_@"));

    }

    @Test
    void getRentals() {
        Customer customer = mock(Customer.class);
        ArrayList<Rental> rl = new ArrayList<Rental>();

        when(customer.getRentals()).thenReturn(rl);
        assertEquals(rl,customer.getRentals());

    }

    @Test
    void setRentals() {
        Customer customer = mock(Customer.class);
        ArrayList<Rental> rl = new ArrayList<Rental>();
        customer.setRentals(rl);
        assertEquals(rl,customer.getRentals());

    }

    @Test
    void statement() {



    }

    @Test
    void htmlStatement() {
    }

    @Test
    void getTotalCharge() {
    }

    @Test
    void getTotalFrequentRenterPoints() {
    }
}