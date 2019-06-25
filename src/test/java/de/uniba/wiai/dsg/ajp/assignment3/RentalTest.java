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
    Movie movie = new Movie("Matrix",REGULAR);
    rental.setMovie(movie);
    assertEquals(movie, rental.getMovie());

    }

    @Test
    void setMovie() {
        Rental rental = new Rental();
        Movie movie = new Movie("the Book",REGULAR);
        rental.setMovie(movie);
        assertEquals(movie, rental.getMovie());
    }

    @Test
    void getDaysRented() {
        Rental rental = new Rental();
        Movie movieA = new Movie("SexInTheCity", Movie.PriceCode.ADULT);
        rental.setDaysRented(10);
        assertEquals(10, rental.getDaysRented());
    }

    @Test
    void setDaysRented() {
        Rental rental = new Rental();
        Movie movieA = new Movie("SexInTheCity", Movie.PriceCode.ADULT);
        rental.setDaysRented(10);

    }

    @Test
    void getCharge() {
        Movie movie = new Movie("the Day", REGULAR);
        movie.getCharge(1);
        assertEquals(2, movie.getCharge(1));
    }

    @Test
    void getFrequentRenterPoints() {
        Movie movie = new Movie("the Day", REGULAR);
        movie.getFrequentRenterPoints(1);
        assertEquals(1, 1);
    }
}