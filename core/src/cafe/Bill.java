package cafe;

import menu.Item;

import java.text.DecimalFormat;
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
    public double getTotalItemsPrice()
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
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        for(Item item : getItems())
        {
            if(item.isHotFood())
            {
                if((getTotalItemsPrice()/100)*20 >=20)
                {
                    return Double.valueOf(decimalFormat.format(20));
                }
                return Double.valueOf(decimalFormat.format((getTotalItemsPrice()/100)*20));
            }
        }
        double totalPrice = getTotalItemsPrice();
        return Double.valueOf(decimalFormat.format((totalPrice/100)*10));
    }

    public double getTotalPrice()
    {
        return getTotalItemsPrice() + serviceCharge();
    }

}
