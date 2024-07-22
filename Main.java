import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main class to run the burger ordering system.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printActions();
            System.out.println("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    orderBasicHamburger();
                    break;
                case 2:
                    orderHealthyBurger();
                    break;
                case 3:
                    orderDeluxeBurger();
                    break;
                default:
                    System.out.println("Invalid action. Please choose a valid option.");
                    break;
            }
        }
    }

    private static void orderBasicHamburger() {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White roll");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        double price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is " + price);
    }

    private static void orderHealthyBurger() {
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHamburgerAddition2("Lettuce", 0.75);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        double price = healthyBurger.itemizeHamburger();
        System.out.println("Total burger price is " + price);
    }

    private static void orderDeluxeBurger() {
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to order a basic hamburger\n" +
                           "2 - to order a healthy burger\n" +
                           "3 - to order a deluxe burger\n" +
                           "Choose your action: ");
    }
}
