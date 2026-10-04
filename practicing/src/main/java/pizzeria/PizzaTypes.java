package pizzeria;


import java.util.HashMap;
import java.util.Map;


public enum PizzaTypes {

    MARGARITA(new Pizza(Size.BIG, 6, "YUMMY")),
    PEPPERONI(new Pizza(Size.MEDIUM, 6, "EWW"));

    private final Pizza pizza;

    PizzaTypes(Pizza pizza){
        this.pizza = pizza;

    }

    public Map<String, Object> getPizza(){
        Map<String, Object> map = new HashMap<>();
        map.put("Size", this.pizza.getSize());
        map.put("Slices", this.pizza.getSlices());
        map.put("Description", this.pizza.getDescription());
        return map;
    }

}
class Pizza {
    private final Size size;
    private final int slices;
    private final String description;

    public Pizza(Size size, int slices, String description) {
        this.slices = slices;
        this.size = size;
        this.description= description;
    }


    public String getDescription() {
        return description;
    }


    public Size getSize() {
        return size;
    }

    public int getSlices() {
        return slices;
    }
}
