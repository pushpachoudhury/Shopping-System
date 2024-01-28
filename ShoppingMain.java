

// ShoppingMain provides method main for a simple shopping program.

public class ShoppingMain {
	 public static void main(String[] args) {
        Catalog list = new Catalog("School Supplies");
        list.add(new Item("Gel Pen", 3.95, 10, 19.99));
        list.add(new Item("Lead Pencil Pack", 3.50, 10, 14.95));
        list.add(new Item("Eraser", 0.99));
        list.add(new Item("Dell Laptop", 389.99));
        list.add(new Item("Laptop Charger", 49.99));
        list.add(new Item("Bookbag", 49.99));
        list.add(new Item("Crayons", 3.400));
        list.add(new Item("Markers", 9.100));
        list.add(new Item("5-Star Notebook", 19.99));
        list.add(new Item("Loose-Leaf", 0.99, 10, 5.0));
        list.add(new Item("Stickers", 0.99, 20, 8.95));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
