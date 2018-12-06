package assignment8p2;
/** class which contains the stock and its details
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 2
 * @since Due - 11/28/18
 */
public class Stock {
    private String name;
    private double price;
    /**overloaded constructor
     * @param name description of the stock
     * @param price
     */
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    /**displays the quantity of stocks bought
     * @param quantity
     */
    public void buy(int quantity){
        System.out.println("BOUGHT:  "+ quantity + "x " + this);
    }
    /**displays the quantity of stocks sold
     * @param quantity
     */
    public void sell(int quantity){
        System.out.println("SOLD: " + quantity + "x " + this);
    }
    /**display method */
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}