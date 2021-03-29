# Factory Pattern


The `Factory Method Pattern` defines an interface for creating an object, but lets subclasses decide which class to instatiate. `Factory Method` lets a class defer instantiation to subclasses.

The problem arise when you have a whole set of related concrete classes and you don't know until runtime which one you need to instantiate. 
```java
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
```
The other problem is that normaly you instantiate a concrete class (an implementation) so when it comes time for changes or extensions, you'll have to reopen the code and examine what needs to be added or deleted. In other words your code will not be `closed for modification`.

#### Encapsulating object creation
The trick is to move the object creation into another object that is only going to be concerned with "creating pizzas". This object we call it `a Factory`.

`Factories` handle the details of object creation. In the above example, once we have a "PizzaFactory", our code becomes a *client* of that object. Anytime it needs a pizza, it asks the `PizzaFactory` to make one. So, by encapsulating the pizza creating in one class, we now have only one place to make modifications when the implementation changes.





Credits:
Head First Design Patterns, 2nd Edition
*by Eric Freeman, Elisabeth Robson, Kathy Sierra, and Bert Bates*
