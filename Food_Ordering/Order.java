package Food_Ordering;

public class Order {
    
    private static final double TAX_RATE = 0.05;
    public static final double DELIVERY_CHARGE = 30.0;
    private static final double FREE_DELIVERY_MIN = 499.0;

    private FoodItem[] items;
    private int[] quantities;
    private int orderCount;

    public Order(int capacity) {
        this.items = new FoodItem[capacity];
        this.quantities = new int[capacity];
        this.orderCount = 0;
    }

    public void addItem(FoodItem item, int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be at least 1. Skipping: " + item.getItemName());

            return;
        }

        for (int i = 0; i < orderCount; i++){
            if(items[i].getItemName().equals(item.getItemName())) {
                quantities[i] += quantity;
                return;
            }
        }

        if(orderCount < items.length) {
            items[orderCount] = item;
            quantities[orderCount] = quantity;
            orderCount++;
        } else {
            System.out.println("Order is full. Cannot add: " + item.getItemName());
        }
    }
    
    public double calculateSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < orderCount; i++) {
            subtotal += items[i].getPrice() * quantities[i];
        }
        return subtotal;
    }

    public double calculateDeliveryCharge(double subtotal) {
        return (subtotal >= FREE_DELIVERY_MIN) ? 0 : DELIVERY_CHARGE;
    }

    public double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }
 
    public double calculateTotal() {
        double subtotal  = calculateSubtotal();
        double delivery  = calculateDeliveryCharge(subtotal);
        double tax       = calculateTax(subtotal);
        return subtotal + delivery + tax;
    }
 
    public void displayOrderSummary() {
        double subtotal  = calculateSubtotal();
        double delivery  = calculateDeliveryCharge(subtotal);
        double tax       = calculateTax(subtotal);
        double total     = subtotal + delivery + tax;
 
        System.out.println("\nOrder Summary:");
        System.out.println("-----------------------");
 
        for (int i = 0; i < orderCount; i++) {
            double lineTotal = items[i].getPrice() * quantities[i];
            System.out.printf("%-18s x%d = ₹%.2f%n",
                    items[i].getItemName(), quantities[i], lineTotal);
        }
 
        System.out.println("-----------------------");
        System.out.printf("Subtotal:          ₹%.2f%n", subtotal);
 
        if (delivery == 0) {
            System.out.println("Delivery Charge:   ₹0 (Free!)");
        } else {
            System.out.printf("Delivery Charge:   ₹%.2f%n", delivery);
        }
 
        System.out.printf("Tax (5%% GST):      ₹%.2f%n", tax);
        System.out.println("-----------------------");
        System.out.printf("Total Amount:      ₹%.2f%n", total);
        System.out.println("-----------------------");
    }
}
