package exercises.phase01.day01.solution;

/**
 * Educational reference solution. Monetary values use BigDecimal to avoid
 * binary floating-point rounding issues.
 */
import java.math.BigDecimal;
import java.util.Objects;

public final class Product {
    private final String name;
    private BigDecimal price;
    private int stock;

    public Product(String name, BigDecimal price, int stock) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        validatePrice(price);
        if (stock < 0) {
            throw new IllegalArgumentException("Stock must not be negative");
        }
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public BigDecimal getPrice() { return price; }
    public int getStock() { return stock; }

    public void sell(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (quantity > stock) {
            throw new IllegalArgumentException("Insufficient stock");
        }
        stock -= quantity;
    }

    public void restock(int quantity) {
        if (quantity <= 0 || quantity > Integer.MAX_VALUE - stock) {
            throw new IllegalArgumentException("Invalid restock quantity");
        }
        stock += quantity;
    }

    public void changePrice(BigDecimal newPrice) {
        validatePrice(newPrice);
        price = newPrice;
    }

    private static void validatePrice(BigDecimal value) {
        if (Objects.isNull(value) || value.signum() <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
    }
}
