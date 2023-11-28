interface Pizza {
    void prepare();
}

class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("cheese pizza prepared");
    }
}

class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("pepperoni pizza prepared");
    }
}

class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veg pizza prepared");
    }
}

class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equalsIgnoreCase("vegpizza")) {
            pizza = new VegPizza();
        }
        return pizza;

    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza("cheese");
        pizza.prepare();
    }
}