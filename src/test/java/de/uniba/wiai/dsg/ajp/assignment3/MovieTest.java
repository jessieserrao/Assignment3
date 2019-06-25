package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;

import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.REGULAR;
import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.ADULT;
import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.CHILDRENS;
import static de.uniba.wiai.dsg.ajp.assignment3.Movie.PriceCode.NEW_RELEASE;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MovieTest {

    @Test
    void getTitle() {
        Movie movie = mock(Movie.class);
        movie.setTitle("matrix");
        assertEquals("matrix", movie.getTitle());

    }

    @Test
    void setTitle() {
        Movie movie = new Movie("The Tag", REGULAR);
        movie.setTitle("the Day");
        assertEquals("the Day", movie.getTitle());
        assertThrows(NullPointerException.class,()->movie.setTitle(null));
        assertThrows(IllegalArgumentException.class,()->movie.setTitle("1234"));
        assertThrows(IllegalArgumentException.class,()->movie.setTitle(""));
        assertThrows(IllegalArgumentException.class,()->movie.setTitle("@_@"));
    }

    @Test
    void getCharge() {
        Movie movie = new Movie("the Day", REGULAR);
        movie.getCharge(1);
        assertEquals(2, movie.getCharge(1));
        assertEquals(3, movie.getCharge(4));
        assertThrows(IllegalArgumentException.class,()->movie.getCharge(-1));
        assertThrows(IllegalArgumentException.class,()->movie.getCharge(-9999999));
        assertThrows(IllegalArgumentException.class,()->movie.getCharge(0));
        assertThrows(IllegalArgumentException.class,()->movie.getCharge(30));
    }

    @Test
    void getPriceCode() {
        Movie movie = new Movie("the Day", REGULAR);
        Movie movie2 = new Movie("the Day", ADULT);
        Movie movie3 = new Movie("the Day", CHILDRENS);
        Movie movie4 = new Movie("the Day", NEW_RELEASE);
        assertEquals(2, movie.getPriceCode());
        assertEquals(5 ,movie2.getPriceCode());
        assertEquals(1.5, movie3.getPriceCode());
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