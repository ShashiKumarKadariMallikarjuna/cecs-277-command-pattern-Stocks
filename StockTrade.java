package assignment8p2;
/** Invoker class which does the trading
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 2
 * @since Due - 11/28/18
 */
import java.util.*;
public class StockTrade {
	private List<Order> orders;
	/**constructor*/
	public StockTrade() {
		orders=new ArrayList<Order>();
	}
	/**method which adds all the requests to trade into the above array
	 * @param l list of trading transactions
	 */
	public void takeOrders(List<Order>l) {
		orders.addAll(l);
	}
	/**invoker method*/
	public void executeOrder() {
		for(Order o:orders) {
			o.execute();
		}
		orders.clear();
	}
}
