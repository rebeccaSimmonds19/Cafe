package menu;

/**
 * Created by Rebecca Simmonds on 18/10/2016.
 * Cheese sandwich menu item
 */
public class CheeseSandwich implements Item
{
    final double price = 2;
    final String description = "cold food";

    /**
     * default constructor
     */
    public CheeseSandwich()
    {

    }

    /**
     * get price
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * get description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * printing
     * @return String
     */
    public String toString()
    {
        return "price: "+price+"\n"+"description: "+description;
    }

}
