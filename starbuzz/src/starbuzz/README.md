# Decorator Pattern

The `Decorator Pattern` attach additional responsibilities to an object dynamically. `Decorators` provide a flexible alternative to subclassing for extending functionality.

The `Decorator` classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation).

`Decorators` change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component.

You can wrap a component with any number of decorators.

`Decorators` are typically transparent to the client of the component - that is, unless the client is relying on the component's concrete type.

`Decorators` can result in many small objects in our design, and overuse can be complex.

### `Classes should be open for extension but closed for modification`

Credits:
Head First Design Patterns, 2nd Edition
*by Eric Freeman, Elisabeth Robson, Kathy Sierra, and Bert Bates*
