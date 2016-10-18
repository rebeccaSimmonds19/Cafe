package cafe;

import menu.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rebecca Simmonds on 18/10/2016.
 * This represents the bill and will add items to a list
 */
public class Bill
{
    //bill list
    List<Item> items = new ArrayList<Item>();

    /**
     * add an item to the list
     * @param item
     */
    public void addItem(Item item)
    {
        items.add(item);
    }

    /**
     * get all items in the list
     * @return
     */
    public List<Item> getItems()
    {
        return items;
    }

    /**
     * get the prices of all items in a list
     * @return
     */
    public List<Double> getItemPrices()
    {
        List<Double> prices = new ArrayList<Double>();

        for(Item item : items)
        {
            prices.add(item.getPrice());
        }
        return prices;
    }

    /**
     * get the total price of all items
     * @return
     */
    public double getTotalPrice()
    {
        double totalPrice = 0;
        for(Item item : items)
        {
            totalPrice +=item.getPrice();
        }
        return totalPrice;
    }

    /**
     * calculates the service charge
     * @return double
     */
    public double serviceCharge()
    {
        for(Item item : getItems())
        {
            if(item.isHotFood())
            {
                return getTotalPrice()/100*20;
            }
        }
        double totalPrice = getTotalPrice();
        return (totalPrice/100)*10;
    }
}
