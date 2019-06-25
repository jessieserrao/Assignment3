package de.uniba.wiai.dsg.ajp.assignment3;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static de.uniba.wiai.dsg.ajp.assignment3.Movie.*;
import static org.junit.jupiter.api.Assertions.*;

public class Integrationtest {

    @Test
    public void printsStatementSuccessWithAllMovieTypes() {

        File testFile = new File("C:\\Users\\falk-\\Desktop\\AJP\\gitA3\\src\\integrationtest\\java\\de\\uniba\\wiai\\dsg\\ajp\\assignment3\\statementOutput.txt");
        String expected ="";

        Customer testCustomer = new Customer("Test Testermann");

        Rental rentalA = new Rental();
        Rental rentalC = new Rental();
        Rental rentalR = new Rental();
        Rental rentalN = new Rental();

        Movie movieA = new Movie("TestAdultMovie", Movie.PriceCode.ADULT);
        Movie movieC = new Movie("TestChildrenMovie", PriceCode.CHILDRENS);
        Movie movieR = new Movie("TestRegularMovie", PriceCode.REGULAR);
        Movie movieN = new Movie("TestNewMovie", PriceCode.NEW_RELEASE);

        assertEquals(3,movieA.getPriceCode());
        rentalA.setMovie(movieA);
        rentalA.setDaysRented(10);
        assertEquals(10,rentalA.getDaysRented());
        assertEquals(movieA, rentalA.getMovie());

        rentalC.setMovie(movieC);
        rentalC.setDaysRented(3);

        rentalR.setMovie(movieR);
        rentalR.setDaysRented(7);

        rentalN.setMovie(movieN);
        rentalN.setDaysRented(23);

        testCustomer.getRentals().add(rentalA);
        testCustomer.getRentals().add(rentalC);
        testCustomer.getRentals().add(rentalR);
        testCustomer.getRentals().add(rentalN);

        try {
            fileWriter(testCustomer,testFile);
        } catch (IOException e) {
            System.err.println("Problem when writing testFile");
        }


        try {
           expected = fileReader(testCustomer, testFile);
        } catch (IOException e) {
            System.err.println("Problem when reading testFile");
        }

        assertEquals(expected,testCustomer.statement());
    }

    private String fileReader(Customer testCustomer, File testFile) throws IOException {
        Path filePath = testFile.toPath();
        ArrayList<String> out = new ArrayList<>();
        BufferedReader reader = Files.newBufferedReader(filePath);

        StringBuilder s = new StringBuilder();

        String response = new String();
        for (String line; (line = reader.readLine()) != null; response += line+"\n");
        System.out.println(response);
        response = response.substring(0, response.length()-1);
        return response;
    }
    public void fileWriter(Customer customer,File testFile) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(testFile));
        try {
            testFile.createNewFile();
            writer.write(customer.statement());
        } catch (IOException e) {
            System.err.println("Problem when writing testFile");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("ignoreChecker Exception");
                }
            }
        }
    }
}

