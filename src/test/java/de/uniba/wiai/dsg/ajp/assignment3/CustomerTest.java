package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer("");
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

        Customer customer = new Customer("Max Mus");

        ArrayList<Rental> rl = new ArrayList<Rental>();
        Rental mockRental = mock(Rental.class);
        rl.add(mockRental);

        customer.setRentals(rl);
        assertEquals(rl,customer.getRentals());

    }

    @Test
    void setRentals() {
        Customer customer = new Customer("Max M");
        ArrayList<Rental> rl = new ArrayList<Rental>();
        Rental mockRental = mock(Rental.class);
        rl.add(mockRental);

        customer.setRentals(rl);
        assertEquals(rl,customer.getRentals());

        assertThrows(NullPointerException.class,()->customer.setRentals(null));

        rl.clear();
        assertThrows(IllegalArgumentException.class, ()->customer.setRentals(rl));
    }

    @Test
    void statement() {
        Customer customer = new Customer("Max Mus");

        System.out.println(customer.statement());



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