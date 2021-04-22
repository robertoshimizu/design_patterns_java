# Design Patterns

In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. Rather, it is a description or template for how to solve a problem that can be used in many different situations. Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

* Knowing the OO basics does not make you a good OO designer.
* Good OO designs are reusable, extensible and maintainable.
* Patterns show you how to build systems with good OO design qualities.
* Patterns are proven object-oriented experience.
* Patterns don't give you code, they give you general solutions to design problems. Then you apply them to your specific application.
* Patterns aren't invented, they are _discovered_.
* Most patterns and principles address issues of _change_ in software.
* Most patterns allow some part of a system to vary independently of all other parts.
* Patterns provide a shared language that can maximize the value of your communication with other developers.

Design patterns gained popularity in computer science after the book Design Patterns: Elements of Reusable Object-Oriented Software was published in 1994 by the so-called "Gang of Four" (Gamma et al.), which is frequently abbreviated as "GoF".

This repository contains my own `Java` implementation and summary of the examples of each pattern, described in the book `Head First Design Patterns`.

| Name | Description |
|------|-------------|
|[Strategy](https://github.com/robertoshimizu/design_patterns_java/tree/main/duck%20-%20strategy)|Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it. |
|Observer or Publisher/Subscriber|Define a one-to-many dependency between objects where a state change in one object results in all its dependents being notified and updated automatically. |
|[Decorator](https://github.com/robertoshimizu/design_patterns_java/tree/main/starbuzz%20-%20decorator/src/starbuzz)|Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.|
|[Factory Method](https://github.com/robertoshimizu/design_patterns_java/tree/main/pizza%20-%20factory)|Define an interface for creating a single object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.|
|Singleton|Ensure a class has only one instance, and provide a global point of access to it.|


### Credits
- [Head First Design Patterns - Freeman & Robson](https://learning.oreilly.com/library/view/head-first-design/0596007124/)
- [Wikipedia](https://en.wikipedia.org/wiki/Design_Patterns)