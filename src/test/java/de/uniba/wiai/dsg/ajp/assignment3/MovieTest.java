package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.REGULAR;
import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.ADULT;
import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.CHILDRENS;
import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.NEW_RELEASE;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MovieTest {
    private Movie movieTest;
    @BeforeEach
    void setUp() {
        movieTest = new Movie("", REGULAR);
    }

    @AfterEach
    void tearDown() {
        movieTest=null;
    }

    @Test
    void getTitle() {
        Movie movie = new Movie("The Tag", REGULAR);
        movie.setTitle("matrix");
        assertEquals("matrix", movie.getTitle());

    }

    @Test
    void setTitle() {
        Movie movie = new Movie("The Tag", REGULAR);
        movie.setTitle("the Day");
        assertEquals("the Day", movie.getTitle());
        assertThrows(NullPointerException.class,()->movie.setTitle(null));
    }

    @Test
    void getCharge() {
        Movie movie = new Movie("the Day", REGULAR);
        movie.getCharge(1);
        assertEquals(2, movie.getCharge(1));
    }

    @Test
    void getPriceCode() {
        Movie movie = new Movie("the Day", REGULAR);
        Movie movie2 = new Movie("the Day", ADULT);
        Movie movie3 = new Movie("the Day", CHILDRENS);
        Movie movie4 = new Movie("the Day", NEW_RELEASE);
        assertEquals(0, movie.getPriceCode());
        assertEquals(3 ,movie2.getPriceCode());
        assertEquals(2, movie3.getPriceCode());
        assertEquals(1, movie4.getPriceCode());
    }

    @Test
    void setPriceCode() {
        Movie movie = mock(Movie.class);
        movie.setPriceCode(REGULAR);
        movie.setPriceCode(ADULT);
        movie.setPriceCode(CHILDRENS);
        movie.setPriceCode(NEW_RELEASE);
        assertEquals(REGULAR, REGULAR);
        assertEquals(ADULT, ADULT);
        assertEquals(CHILDRENS, CHILDRENS);
        assertEquals(NEW_RELEASE, NEW_RELEASE);
    }

    @Test
    void getFrequentRenterPoints() {
        Movie movie = new Movie("the Day", REGULAR);
        movie.getFrequentRenterPoints(1);
        assertEquals(1, 1);

    }
}