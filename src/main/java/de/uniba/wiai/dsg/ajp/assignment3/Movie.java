package de.uniba.wiai.dsg.ajp.assignment3;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private Price price;

	private String title;

	public Movie(String title, int priceCode) {
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

	double getCharge(int daysRented) {
		Validator.validateDaysRented(daysRented);
		return price.getCharge(daysRented);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		Validator.validatePriceCode(priceCode);
		switch (priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public int getFrequentRenterPoints(int daysRented) {

		Validator.validateDaysRented(daysRented);

		return price.getFrequentRenterPoints(daysRented);
	}

}
