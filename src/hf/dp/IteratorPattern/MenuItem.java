package hf.dp.IteratorPattern;

public class MenuItem extends MenuComponent {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public void print(){
        System.out.print("	" + getName());
        if (this.isVegetarian()) System.out.println("(v)");
        System.out.println(", " + getPrice());
        System.out.println("	--" + getDescription());
    }

}
