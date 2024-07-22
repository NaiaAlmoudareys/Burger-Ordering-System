import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a healthy burger with additional healthy options.
 */
public class HealthyBurger extends Hamburger {
    private static final Logger logger = Logger.getLogger(HealthyBurger.class.getName());
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    /**
     * Constructs a new HealthyBurger with the specified meat and price.
     *
     * @param meat the type of meat
     * @param price the base price
     */
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            logger.log(Level.INFO, "Added {0} for an extra {1}", new Object[]{this.healthyExtra1Name, this.healthyExtra1Price});
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            logger.log(Level.INFO, "Added {0} for an extra {1}", new Object[]{this.healthyExtra2Name, this.healthyExtra2Price});
        }
        return hamburgerPrice;
    }
}
