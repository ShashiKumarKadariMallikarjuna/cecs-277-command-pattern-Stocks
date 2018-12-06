package assignment8p2;
/** Concrete command to sell a stock
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 2
 * @since Due - 11/28/18
 */
public class sellStock implements Order{
	private Stock stock;
	private int quantity;
	/**overloaded constructor
	  * @param stock
	  * @param quantity
	  */
	public sellStock(Stock stock,int quantity) {
		this.stock=stock;
		this.quantity=quantity;
	}
	/**overridden method*/
	@Override
	public void execute() {
		stock.sell(quantity);
	}
	/**method that returns the stock
	 * @return stock
	 */
	public Stock getstock() {
		return stock;
	}
}
