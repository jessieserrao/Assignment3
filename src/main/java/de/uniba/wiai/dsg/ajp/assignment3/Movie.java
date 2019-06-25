package de.uniba.wiai.dsg.ajp.assignment3;

/**
 * Represents the movie to be rented in the NedFligs
 */
public class Movie {
    /**
     * the Price type
     */
    private Price price;
    /**
     * title of the movie
     */
    private String title;

    /**
     * the movie Object to be used, it has title and a Price Code
     * @param title the title of the movie
     * @param priceCode the price code that returns the movie value
     */
    public Movie(String title, PriceCode priceCode) {
        Validator.validateTitle(title);
        Validator.validatePriceCode(priceCode);

        this.title = title;
        this.setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Validator.validateTitle(title);
        this.title = title;
    }

    /**
     * get the charge of a movie
     * @param daysRented the number of days that a movie will be rented for a customer
     * @return the price for this charge
     */
    double getCharge(int daysRented) {
        Validator.validateDaysRented(daysRented);
        return price.getCharge(daysRented);
    }

    /**
     * Gets the Price Code of a movie
     * @return the number corrempodent of a the movie type
     */
    public int getPriceCode() {
        return price.getPriceCode();
    }

    /**
     * Sets the Price code number of a movie type
     * @param priceCode
     */
    public void setPriceCode(PriceCode priceCode) {
        Validator.validatePriceCode(priceCode);

        switch (priceCode) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            case ADULT:
                this.price = new AdultPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    /**
     * Gets the the points from the Frequent Renter Points System
     * @param daysRented give the number of days that a movie will be rented
     * @return  the number of Frequent Renter Points
     */
    public int getFrequentRenterPoints(int daysRented) {

        Validator.validateDaysRented(daysRented);

        return price.getFrequentRenterPoints(daysRented);
    }
    /**
     * the Enumeration that will be in the set Price Code, it determine the constants with the corespondent value
     */
    public enum PriceCode {
        ADULT(3),
        CHILDRENS(2),
        NEW_RELEASE(1),
        REGULAR(0);

        private int value;

        PriceCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
