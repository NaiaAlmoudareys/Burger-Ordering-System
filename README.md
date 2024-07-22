# Burger Ordering System

## Overview

The Burger Ordering System is a Java application designed to simulate the ordering process of different types of burgers, including basic, healthy, and deluxe burgers. It provides a user-friendly interface to customize and order burgers with various additions.

## Features

- **Basic Hamburger**: Order a basic hamburger with up to four additional items.
- **Healthy Burger**: Order a healthy burger with up to two additional healthy items.
- **Deluxe Burger**: Order a deluxe burger with predefined additions (chips and drink).
- **User Interface**: Console-based interactive interface for easy ordering.
- **Logging**: Logging functionality for better debugging and monitoring.

## How to Use

1. **Start the Application**: Run the `Main` class to start the application.
2. **Order Burgers**: Follow the prompts to order a basic hamburger, healthy burger, or deluxe burger.
3. **Customize Additions**: Add desired items to your burger and see the total price.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your computer.

### Installation

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Ensure the JDK is correctly set up in your IDE.

### Running the Application

1. Compile and run the `Main` class.
2. Follow the on-screen instructions to order and customize your burgers.

## Code Structure

- **Main.java**: Contains the main application logic and user interface.
- **Hamburger.java**: Defines the Hamburger class, including methods for managing additions and calculating prices.
- **HealthyBurger.java**: Extends the Hamburger class with additional healthy options.
- **DeluxeBurger.java**: Extends the Hamburger class with predefined additions.

## Example Usage

1. Order a basic hamburger:
   ```java
   Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White roll");
   hamburger.addHamburgerAddition1("Tomato", 0.27);
   hamburger.addHamburgerAddition2("Lettuce", 0.75);
   hamburger.addHamburgerAddition3("Cheese", 1.13);
   double price = hamburger.itemizeHamburger();
   System.out.println("Total burger price is " + price);
