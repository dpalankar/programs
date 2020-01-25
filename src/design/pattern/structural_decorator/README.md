#### Decorator/Wrapper Pattern
attach a flexible additional responsibilities to an object dynamically.

Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected


Suppose we want to implement different kinds of cars – we can create interface Car to define the assemble method and then we can have a Basic car, further more we can extend it to Sports car and Luxury Car. The implementation hierarchy will look like below image.
![alt composite](https://github.com/dpalankar/programs/blob/master/src/design/pattern/structural_decorator/decorator.png)
But if we want to get a car at runtime that has both the features of sports car and luxury car, then the implementation gets complex and if further more we want to specify which features should be added first, it gets even more complex. Now imagine if we have ten different kind of cars, the implementation logic using inheritance and composition will be impossible to manage. To solve this kind of programming situation, we apply decorator pattern in java.

![alt composite1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/structural_decorator/decorator.png)