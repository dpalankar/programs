#### Flyweight Pattern
to reuse already existing similar kind of objects by storing them and create new object when no matching object is found.

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. 

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.


Flyweight design pattern is used when we need to create a lot of Objects of a class. Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects.

![alt flyweight](https://github.com/dpalankar/programs/blob/master/src/design/pattern/structural_flyweight/flyweight.png)

#### Flyweight Design Pattern Example in JDK
All the wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern. The best example is Java String class String Pool implementation.
