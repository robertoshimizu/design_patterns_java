package pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = chicagoStore.orderPizza("cheese");

        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}

