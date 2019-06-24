package de.uniba.wiai.dsg.ajp.assignment3;

public class Movie {

	public enum PriceCode {
		ADULT(3),
		CHILDRENS(2),
		NEW_RELEASE(1),
		REGULAR(0);

		private int value;

		PriceCode(int valor) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValor(int valor) {
			this.value = valor;
		}
	}

	private PriceCode pc;
	private Price price;

	private String title;

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

	double getCharge(int daysRented) {
		Validator.validateDaysRented(daysRented);
		return price.getCharge(daysRented);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(PriceCode priceCode) {
		//Validator.validatePriceCode(priceCode);

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
			case ADULT:
			price = new AdultPrice();
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
