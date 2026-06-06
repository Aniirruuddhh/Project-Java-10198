import Food_Ordering.FoodItem;
import Food_Ordering.Restaurant;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Spice Garden", 10);
 
        FoodItem burger   = new FoodItem("Burger",    100.00);
        FoodItem pizza    = new FoodItem("Pizza",     300.00);
        FoodItem pasta    = new FoodItem("Pasta",     180.00);
        FoodItem coldDrink = new FoodItem("Cold Drink", 60.00);
        FoodItem iceCream = new FoodItem("Ice Cream",  80.00);
 
        restaurant.addMenuItem(burger);
        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(pasta);
        restaurant.addMenuItem(coldDrink);
        restaurant.addMenuItem(iceCream);
 
        restaurant.showMenu();
    }
}
