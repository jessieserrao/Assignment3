package de.uniba.wiai.dsg.ajp.assignment3;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a Customer that will rent a movie
 * A Customer can rent more than one movie
 * @author jessieserrao
 *
 */
public class Customer {
	/**
	 * the first and last name of this Customer
	 */
	private String name;
	/**
	 * List of the movies rented from the Customer
	 */
	private List<Rental> rentals = new LinkedList<Rental>();

	/**
	 * Creates a new Customer with the given name.
	 * the name should include both names first and last name.
	 * @param name;
	 */



	public Customer(String name) {
		super();

		Validator.validateName(name);
			this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {

		Validator.validateName(name);
			this.name = name;

		this.name = name;
	}

	/**
	 * Gets the list of movies that will be rented
	 * @return this list
	 */
	public List<Rental> getRentals() {

		return rentals;
	}

	/**
	 * Set the list of movies that will be rented
	 * @param rentals list of rentals movies
	 */
	public void setRentals(List<Rental> rentals) {
		Validator.validateList(getRentals());
		this.rentals = rentals;
	}

	/**
	 * Search for the
	 * @return
	 */
	public String statement() {
		String result = "Rental Record for " + getName() + "\n";

		int frequentRenterPoints = 0;
		for (Rental each : this.rentals) {
			frequentRenterPoints += each.getFrequentRenterPoints();

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
		}

		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";

		for (Rental each : rentals) {
			// show figures for each rental
			result += each.getMovie().getTitle() + ": "
					+ String.valueOf(each.getCharge()) + "<BR>\n";
		}

		// add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge())
				+ "</EM><P>\n";
		result += "On this rental you earned <EM>"
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
		return result;
	}

	/**
	 * Sum of the Prices of all chosen movies listed in the Customer List and
	 * @return the total price of this sum.
	 */
	double getTotalCharge() {
		double result = 0;

		for (Rental each : rentals) {
			result += each.getCharge();
		}

		return result;
	}

	/**
	 * Sum of all Points from the rental Points system
	 * @return the total of Points on this Rental.
	 */
	int getTotalFrequentRenterPoints() {
		int result = 0;

		for (Rental each : rentals) {
			result += each.getFrequentRenterPoints();
		}

		return result;
	}

}
