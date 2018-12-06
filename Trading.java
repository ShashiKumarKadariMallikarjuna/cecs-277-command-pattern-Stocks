package assignment8p2;
/** Client class
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 2
 * @since Due - 11/28/18
 */
import java.util.ArrayList;
import java.util.List;

public class Trading {
	/**main method
	 * @param args
	 */
	public static void main(String []args) {
		//stocks
		Stock s1=new Stock("Apple",500);
		Stock s2=new Stock("Yahoo",1000);
		Stock s3=new Stock("Google",2000);
		//trading stocks
		StockTrade d=new StockTrade();
		Order o1=new sellStock(s1, 100);
		Order o2=new buyStock(s1, 100);
		Order o3=new sellStock(s3, 1000);
		
		List<Order> orders=new ArrayList<Order>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		d.takeOrders(orders);
		d.executeOrder();
	}
}
