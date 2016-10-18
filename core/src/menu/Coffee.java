package menu;

/**
 * Created by Rebecca Simmonds on 18/10/2016.
 * Coffee item on the menu
 */
public class Coffee implements Item
{
    final double price = 1;
    final String description = "hot drink";

    /**
     * default constructor
     */
    public Coffee()
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
