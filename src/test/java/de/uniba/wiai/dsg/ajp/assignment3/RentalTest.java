package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.REGULAR;
import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
      private  RentalTest rentalTest;
    @BeforeEach
    void setUp() {
        this.rentalTest = new RentalTest();
    }

    @AfterEach
    void tearDown() {
        this.rentalTest=null;
    }

    @Test
    void getMovie() {
        Rental rental = new Rental();
        rental.getMovie();
        assertEquals();


    }

    @Test
    void setMovie() {
    }

    @Test
    void getDaysRented() {
    }

    @Test
    void setDaysRented() {
    }

    @Test
    void getCharge() {
    }

    @Test
    void getFrequentRenterPoints() {
    }
}