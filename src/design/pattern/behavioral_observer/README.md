#### Interpreter Pattern
just define a one-to-one dependency so that when one object changes state, all its dependents are notified and updated automatically.

The Memento pattern is also known as Dependents or Publish-Subscribe..

Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.

Java provides an inbuilt platform for implementing Observer pattern through java.util.Observable class and java.util.Observer interface. However, it’s not widely used because the implementation is really simple and most of the times we don’t want to end up extending a class just for implementing Observer pattern as java doesn’t provide multiple inheritances in classes.

Java Message Service (JMS) uses Observer pattern along with Mediator pattern to allow applications to subscribe and publish data to other applications.

Observer design pattern is also called as publish-subscribe pattern. Some of it’s implementations are;

java.util.EventListener in Swing
javax.servlet.http.HttpSessionBindingListener
javax.servlet.http.HttpSessionAttributeListener

![alt composite1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_observer/observer.png)

