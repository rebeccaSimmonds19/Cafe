package menu;

/**
 * Created by Rebecca Simmonds on 18/10/2016.
 * steak sandwich item
 */
public class SteakSandwich implements Item
{
    final double price = 4.5;
    final String description = "hot food";
    final boolean hotFood = true;

    /**
     * default constructor
     */
    public SteakSandwich()
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
