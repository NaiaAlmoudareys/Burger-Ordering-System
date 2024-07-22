import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a basic hamburger with optional additions.
 */
public class Hamburger {
    private static final Logger logger = Logger.getLogger(Hamburger.class.getName());
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    /**
     * Constructs a new Hamburger with the specified name, meat, price, and bread roll type.
     *
     * @param name the name of the hamburger
     * @param meat the type of meat
     * @param price the base price
     * @param breadRollType the type of bread roll
     */
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        logger.log(Level.INFO, "{0} hamburger on a {1} roll with {2}, price is {3}", new Object[]{this.name, this.breadRollType, this.meat, this.price});

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            logger.log(Level.INFO, "Added {0} for an extra {1}", new Object[]{this.addition1Name, this.addition1Price});
        }

        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            logger.log(Level.INFO, "Added {0} for an extra {1}", new Object[]{this.addition2Name, this.addition2Price});
        }

        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            logger.log(Level.INFO, "Added {0} for an extra {1}", new Object[]{this.addition3Name, this.addition3Price});
        }

        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            logger.log(Level.INFO, "Added {0} for an extra {1}", new Object[]{this.addition4Name, this.addition4Price});
        }

        return hamburgerPrice;
    }
}
