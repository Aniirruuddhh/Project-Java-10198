# Food Ordering Java Project

This is a simple Java food ordering project. It contains classes for food items, a restaurant menu, and order calculation.

## Project Explanation

This project demonstrates a basic food ordering system using core Java concepts such as classes, objects, arrays, constructors, methods, access modifiers, and packages. The application models a restaurant that has a menu of food items. Each food item has a name and price, and the restaurant can store and display multiple menu items.

The project is organized around three main classes inside the `Food_Ordering` package:

- `FoodItem` represents one menu item, such as Burger, Pizza, or Pasta. It stores the item name and price.
- `Restaurant` represents a restaurant with a name and a fixed-size menu. It can add food items to the menu and display them.
- `Order` represents a customer's order. It can store selected food items with quantities, calculate the subtotal, apply a delivery charge, calculate tax, and display the final bill.

The `Main` class is the starting point of the program. It creates a restaurant named `Spice Garden`, creates several food items, adds them to the restaurant menu, and displays the menu to the user.

This project is useful for understanding how object-oriented programming works in Java. Each class has a specific responsibility, making the code easier to read, maintain, and expand. For example, more features could be added later, such as taking user input, placing orders from the displayed menu, saving order history, or applying discounts.

## Project Structure

```text
.
├── Main.java
└── Food_Ordering
    ├── FoodItem.java
    ├── Order.java
    └── Restaurant.java
```

## Features

- Create food items with a name and price
- Add food items to a restaurant menu
- Display the restaurant menu
- Create an order with item quantities
- Calculate subtotal, delivery charge, tax, and total amount

## How to Compile

Run this command from the project folder:

```bash
javac Main.java Food_Ordering/*.java
```

## How to Run

After compiling, run:

```bash
java Main
```

## Example Output

```text
===== Welcome to Spice Garden =====
1. Burger --> Rs.100.0
2. Pizza --> Rs.300.0
3. Pasta --> Rs.180.0
4. Cold Drink --> Rs.60.0
5. Ice Cream --> Rs.80.0
-----------------------------------
```

## Git Commands

After creating or editing files, save the changes in Git:

```bash
git add -A
git commit -m "Add README"
git push
```
