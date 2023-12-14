package hf.dp.IteratorPattern;

import hf.dp.MyHWInfo;

public class MenuTestDrive {
    public static void main(String args[]) {
        MyHWInfo myHWInfo = new MyHWInfo();
        myHWInfo.printInfo();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
// With iterators
        System.out.println("[All Menu]");
        waitress.printMenu();
        System.out.println("\n[Vegetarian Menu]");
        waitress.printVegetarianMenu();
    }
}
