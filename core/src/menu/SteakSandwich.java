package menu;

/**
 * Created by Rebecca Simmonds on 18/10/2016.
 * steak sandwich item
 */
public class SteakSandwich
{
    final double price = 4.5;
    final String description = "hot food";

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
     * printing
     * @return String
     */
    public String toString()
    {
        return "price: "+price+"\n"+"description: "+description;
    }
}
