package pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        } else if (item.equals("clam")){
            return new NYStyleClamPizza();
        } else if (item.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else return null;
    }

    private class NYStyleCheesePizza extends Pizza {
    }

    private class NYStylePepperoniPizza extends Pizza {
    }

    private class NYStyleClamPizza extends Pizza {
    }

    private class NYStyleVeggiePizza extends Pizza {
    }
}

class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        } else if (item.equals("clam")){
            return new ChicagoStyleClamPizza();
        } else if (item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }

    private class ChicagoStyleVeggiePizza extends Pizza {
    }

    private class ChicagoStyleCheesePizza extends Pizza {
        public ChicagoStyleCheesePizza() {
            name = "Chicago Style Deep Disch Cheese Pizza";
            dough = "Extra thick Crust dough";
            sauce = "Plum Tomato sauce";

            toppings.add("Shred Mozzarella cheese");
        }
        @Override
        void cut(){
            System.out.println("Cutting the pizza into square slices");
        }
    }

    private class ChicagoStylePepperoniPizza extends Pizza {
    }

    private class ChicagoStyleClamPizza extends Pizza {
    }
}

class CaliforniaPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
        } else if (item.equals("pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        } else if (item.equals("clam")){
            return new CaliforniaStyleClamPizza();
        } else if (item.equals("veggie")){
            return new CaliforniaStyleVeggiePizza();
        } else return null;
    }

    private class CaliforniaStyleCheesePizza extends Pizza {
    }

    private class CaliforniaStylePepperoniPizza extends Pizza {
    }

    private class CaliforniaStyleClamPizza extends Pizza {
    }

    private class CaliforniaStyleVeggiePizza extends Pizza {
    }
}
