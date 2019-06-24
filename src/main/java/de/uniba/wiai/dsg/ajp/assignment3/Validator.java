package de.uniba.wiai.dsg.ajp.assignment3;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {


    public static  int validateDaysRented(int daysRented){

        if(daysRented<=0 || daysRented>30){
            throw new IllegalArgumentException("Please enter a number above 0 and below 31");
        }
        return daysRented;
    }

    public static String validateName(String name) {
        Objects.requireNonNull(name, "Name must not be null");
        if(!name.matches("(?i)[a-z]([- ',.a-z]{0,23}[a-z])?")){
            throw new IllegalArgumentException("Name cant contain special signs or numbers");
        } else return name;
    }

    public static List validateList(List anyList){
        Objects.requireNonNull(anyList, "List must not be null");
        if(anyList.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        } else return anyList;

    }
    public static int validatePriceCode(int priceCode){
        if(!(priceCode==0||priceCode==1||priceCode==2)){
            throw new IllegalArgumentException("Pricecode can only be 0 or 1 or 2");
        } else return priceCode;
    }
    public static String validateTitle(String title){
        Objects.requireNonNull(title, "Title must not be null");
        if(title.isEmpty()){
            throw new IllegalArgumentException("Title must not be empty");
        }
        return title;
    }
    public static Movie validateMovie(Movie movie){
        validateTitle(movie.getTitle());
        validatePriceCode(movie.getPriceCode());
        return movie;
    }

}
