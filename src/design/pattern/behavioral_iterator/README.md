#### Iterator Pattern
to access the elements of an aggregate object sequentially without exposing its underlying implementation.

The Iterator pattern is also known as Cursor.

Iterator pattern in one of the behavioral pattern and it’s used to provide a standard way to traverse through a group of Objects.

Iterator pattern is not only about traversing through a collection, but we can also provide different kind of iterators based on our requirements. Iterator pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods.

![alt composite1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_iterator/iterator.png)

Iterator Design Pattern in JDK
We all know that Collection framework Iterator is the best example of iterator pattern implementation but do you know that java.util.Scanner class also Implements Iterator interface. Read this post to learn about Java Scanner Class.