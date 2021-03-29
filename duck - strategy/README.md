# Strategy Pattern

The problem is how to extend the behaviors of a superclass to a set of subclasses alike, but each subclass could have differences?

Initially you might think using _Inheritance_, you could have a superclass _Duck_ and the different kinds of ducks inheriting the attributes and behaviors. You may find attributes and behaviors that do not change across different kinds of ducks and some that may vary. For example, all ducks swim, but not all can fly or quack, or they quack differently. By using inheritance you would have to override the `fly()` and `quack()` methods for every kind of ducks.

Could you define an interface, and let only ducks that fly or quack implement the interfaces? It could work, however if you want to make any changes in the `Fly()` or `Quack()` interfaces, then you would have to update every implementation of the interface.

In sum, you have some methods/behavior that changes, and to maintain the code is very difficult and prone to errors.

The trick is to _encapsulate_ these methods (things that varies), so it won't affect the rest of the code.

The `Strategy Pattern` defines a family of algorithms, encapsulates each one, and makes them interchangeable. `Strategy` lets the algorithm vary independently from clients that use it.

Instead of thinking of the duck behaviors as a *set of behaviors*, we'll start thinking of them as a *family of algorithms*. In this project, the algorithms represent things a duck would do (different ways of quacking or flying), but we could just use the same techniques for a set of classes that implement the way to compute sales tax by different states (Aniche has a example in his book).

![Class Diagram](../assets/DuckStructure.png)

Each duck has a **FlyBehavior** and a **QuackBehavior** to which delegates flying and quacking. When you put two classes together like this, your're using `Composition`. Instead of *inheriting* their behavior, the ducks get their behavior by being *composed* with the right behavior object.

![Duck Simulation](../assets/DuckSimulation.png)


### `Favor composition over inheritance`

Creating systems using composition gives you a lot mode flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also let you **change behavior at runtime** as long as the object you're composing with implements the correct behavior interface.




Credits:
Head First Design Patterns, 2nd Edition
*by Eric Freeman, Elisabeth Robson, Kathy Sierra, and Bert Bates*
