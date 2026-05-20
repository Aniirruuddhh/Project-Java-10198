class FoodItem {
    private String itemName;
    private double price;

    public FoodItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}

class Restaurant {
    private String restaurantName;
    private FoodItem[] menu;

    public Restaurant(String restaurantName, FoodItem[] menu) {
        this.restaurantName = restaurantName;
        this.menu = menu;
    }

    public void displayMenu() {
        System.out.println("=== Menu of " + restaurantName + " ===");
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                System.out.println((i + 1) + ". " + menu[i].getItemName() + " - ₹" + menu[i].getPrice());
            }
        }
        System.out.println("===============================");
    }
}
public class project1 {
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem("Paneer Tikka", 250.0);
        FoodItem item2 = new FoodItem("Butter Naan", 50.0);
        FoodItem item3 = new FoodItem("Dal Makhani", 200.0);
        FoodItem item4 = new FoodItem("Chocolate Ice Cream", 80.0);

        FoodItem[] menu = {item1, item2, item3, item4};
        Restaurant restaurant = new Restaurant("Taste of India", menu);

        restaurant.displayMenu();
        System.out.println();
    }
}