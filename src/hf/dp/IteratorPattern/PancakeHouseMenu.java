package hf.dp.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {


    ArrayList<MenuItem> menuItems;

    // constructor
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    private void addItem(String name, String description,boolean Veggies, double price) {
        MenuItem menuItem = new MenuItem(name, description, Veggies, price);
        menuItems.add(menuItem);
    }
// addItem
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
