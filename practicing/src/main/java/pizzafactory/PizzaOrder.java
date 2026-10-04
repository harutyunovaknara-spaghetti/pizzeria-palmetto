package pizzafactory;

import org.json.JSONObject;
import pizzeria.PizzaTypes;

public class PizzaOrder {
    public static void main(String[] args) {
        PizzaTypes maragrita = PizzaTypes.MARGARITA;
        JSONObject pizzaToString = new JSONObject();
        pizzaToString.put("margarita", maragrita.getPizza());
        System.out.println(pizzaToString.getJSONObject("margarita"));
    }
}
