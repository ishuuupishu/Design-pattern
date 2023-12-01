// Component Interface
interface Pizza {
    String getDescription();

    double getCost();
}

// Concrete Component
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

// Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete Decorator
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}

// Usage
public class DecoratorPattern {
    public static void main(String[] args) {
        // Create a plain pizza
        Pizza pizza = new PlainPizza();

        // Add cheese using decorator
        pizza = new CheeseDecorator(pizza);

        // Output the description and cost
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());
    }
}
