/**
 * 
 */
package Week3Exercise1;

import org.apache.commons.csv.CSVParser;
import edu.duke.FileResource;

/**
 * @author Andy
 *
 */
public class Week3Exercise1 {

	public static void tester(){
		
		FileResource fr = new FileResource();
		CSVParser parser = fr.getCSVParser();
		
		System.out.println(countryInfo(parser,"Germany"));
		fr.getCSVParser();
		
		listExportersTwoProducts(parser, "gold", "diamonds");
		fr.getCSVParser();

		System.out.println(numberOfExporters(parser,"gold"));
		fr.getCSVParser();
		
		bigExporters(parser,"$999,999,999");	
		
		
		return;
		
	}
	
	/**
	 * 
	 * @param parser
	 * @param country
 	 * @return
	 * 
	 * This method returns a string of information about the country or
	 * returns �NOT FOUND� if there is no information about the country.
	 * The format of the string returned is the country, followed by
	 * �: �, followed by a list of the countries� exports, followed by
	 * �: �, followed by the countries export value. For example, using
	 * the file exports_small.csv and the country Germany, the program
	 * returns the string:
	 * 
	 * Germany: motor vehicles, machinery, chemicals: $1,547,000,000,000
	 */
	public static String countryInfo(CSVParser parser, String country) {
		
		String countryInfo="";
		
		return countryInfo;
	}
	
	/**
	 * 
	 * @param parser
	 * @param exportItem1
	 * @param exportItem2
	 * 
	 * This method prints the names of all the countries that have both
	 * exportItem1 and exportItem2 as export items. For example, using
	 * the file exports_small.csv, this method called with the items
	 * �gold� and �diamonds� would print the countries:
	 * 
	 * Namibia
	 * South Africa
	 * 
	 */
	public static void listExportersTwoProducts(CSVParser parser,
												String exportItem1,
												String exportItem2) {
						
		return;
	}
	
	/**
	 * 
	 * @param parser
	 * @param exportItem
	 * @return
	 * 
	 * 	This method returns the number of countries that export
	 *  exportItem. For example, using the file exports_small.csv,
	 *  this method called with the item �gold� would return 3.
	 * 
	 */
	public static int numberOfExporters(CSVParser parser, String exportItem) {
		
		int count=0;
		
		return count;
		
	}
			
	/**
	 * 
	 * @param parser
	 * @param amount
	 * 
	 * This method prints the names of countries and their Value amount
	 * for all countries whose Value (dollars) string is longer than
	 * the amount string. You do not need to parse either string value
	 * as an integer, just compare the lengths of the strings. For
	 * example, if bigExporters is called with the file exports_small.csv
	 * and amount with the string $999,999,999, then this method would
	 * print eight countries and their export values shown here:
	 * 
	 * Germany $1,547,000,000,000
	 * Macedonia $3,421,000,000
	 * Malawi $1,332,000,000
	 * Malaysia $231,300,000,000
	 * Namibia $4,597,000,000
	 * Peru $36,430,000,000
	 * South Africa $97,900,000,000
	 * United States $1,610,000,000,000
	 * 
	 */
	public static void bigExporters (CSVParser parser, String amount) {

		return;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		tester();
		
	}

}
