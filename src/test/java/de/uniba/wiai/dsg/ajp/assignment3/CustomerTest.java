package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import java.util.ArrayList;

import static de.uniba.wiai.dsg.ajp.assignment3.Movie.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer("");
        customer.setName("Max M");
        assertEquals("Max M",customer.getName());
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

        Customer customer = new Customer("Max M");

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
        Customer emptyCustomer = new Customer("Max M");

        System.out.println(emptyCustomer.statement());

        Customer customerWithRentals=new Customer("Max R");
        Rental rental = new Rental();
        Movie movie = new Movie("MockTitle", PriceCode.ADULT);
        rental.setMovie(movie);
        rental.setDaysRented(5);
        ArrayList<Rental> rl = new ArrayList<Rental>();

        for(int i=0;i<10;i++){
            rl.add(rental);
        }
        customerWithRentals.setRentals(rl);

        System.out.println(customerWithRentals.statement());

        /* with mock:
        Customer mockCustomer = new Customer("Max Mock");
        Rental mrental = mock(Rental.class);
        Movie mmovie = mock(Movie.class);
        mmovie.setTitle("Mock");
        mmovie.setPriceCode(PriceCode.CHILDRENS);

        mrental.setDaysRented(10);
        mrental.setMovie(mmovie);

        rl.clear();
        rl.add(mrental);

        mockCustomer.setRentals(rl);

        mockCustomer.statement(); */
    }

    @Test
    void htmlStatement() {
        Customer emptyCustomer = new Customer("Max M");
        System.out.println(emptyCustomer.htmlStatement());

        Customer customerWithRentals=new Customer("Max R");
        Rental rental = new Rental();
        Movie movie = new Movie("MockTitle", PriceCode.REGULAR);
        rental.setMovie(movie);
        rental.setDaysRented(5);
        ArrayList<Rental> rl = new ArrayList<Rental>();

        for(int i=0;i<10;i++){
            rl.add(rental);
        }
        customerWithRentals.setRentals(rl);

        System.out.println(customerWithRentals.htmlStatement());


    }


}