# Food Ordering Java Project

This is a simple Java food ordering project. It contains classes for food items, a restaurant menu, and order calculation.

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
