import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a deluxe burger with chips and drink included.
 */
public class DeluxeBurger extends Hamburger {
    private static final Logger logger = Logger.getLogger(DeluxeBurger.class.getName());

    /**
     * Constructs a new DeluxeBurger with predefined additions.
     */
    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        logger.log(Level.WARNING, "Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        logger.log(Level.WARNING, "Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        logger.log(Level.WARNING, "Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        logger.log(Level.WARNING, "Cannot add additional items to a deluxe burger");
    }
}
