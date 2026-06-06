package Food_Ordering;

public class Restaurant {

    private String nameOfRestaurant;
    private FoodItem[] foodMenu;
    private int menuCount;

    public Restaurant(String nameOfRestaurant, int menuCapacity) {
        this.nameOfRestaurant = nameOfRestaurant;
        this.foodMenu = new FoodItem[menuCapacity];
        this.menuCount = 0;
    }

    public void addMenuItem(FoodItem item) {
        if (menuCount < foodMenu.length) {
            foodMenu[menuCount++] = item;
        } else {
            System.out.println("Menu is full. Cannot add: " + item.getItemName());
        }
    }

    public void showMenu() {
        System.out.println("===== Welcome to " + nameOfRestaurant + " =====");

        for (int i = 0; i < menuCount; i++) {
            FoodItem item = foodMenu[i];

            System.out.println(
                    (i + 1) + ". " +
                    item.getItemName() +
                    " --> Rs." +
                    item.getPrice()
            );
        }

        System.out.println("-----------------------------------");
    }

    public String getRestaurant() {
        return nameOfRestaurant;
    }

    public FoodItem[] getMenu() {
        return foodMenu;
    }

    public int getMenuCount() {
        return menuCount;
    }
}
