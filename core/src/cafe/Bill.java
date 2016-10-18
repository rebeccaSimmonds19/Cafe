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

}
