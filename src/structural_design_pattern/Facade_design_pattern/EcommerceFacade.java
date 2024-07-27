package structural_design_pattern.Facade_design_pattern;

public interface EcommerceFacade {
    void addToCart(String var1, int var2);

    void removeItemFromCart(String var);

    void checkout(String var);
}
