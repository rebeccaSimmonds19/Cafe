package menu;

/**
 * Created by Rebecca Simmonds on 18/10/2016.
 * Menu item Cola
 */
public class Cola implements Item
{
    final double price = 0.5;
    final String description = "cold drink";
    final boolean hotFood = false;

    /**
     * default constructor
     */
    public Cola()
    {

    }

    /**
     * get price
     * @return double
     */
    public double getPrice()
    {
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
     * is hot food
     * @return boolean
     */
    public boolean isHotFood() {
        return hotFood;
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
