package de.uniba.wiai.dsg.ajp.assignment3;

public class NewReleasePrice extends Price{

	@Override
	double getCharge(int daysRented) {

		Validator.validateDaysRented(daysRented);

		return daysRented * 3;
	}

	@Override
	int getFrequentRenterPoints(int daysRented) {

		Validator.validateDaysRented(daysRented);

		if(daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}

	@Override
	int getPriceCode() {
		return Movie.PriceCode.NEW_RELEASE.getValue();
	}
	
}
