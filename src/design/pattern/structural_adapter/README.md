#### Adapter Pattern
converts the interface of a class into another interface that a client wants.

In other words, to provide the interface according to client requirement while using the services of a class with a different interface.

#### Two Way Adapter Pattern
While implementing Adapter pattern, there are two approaches – class adapter and object adapter – however both these approaches produce same result.

Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
Object Adapter – This form uses Java Composition and adapter contains the source object.

Some of the adapter design pattern example I could easily find in JDK classes are;
java.util.Arrays#asList()
java.io.InputStreamReader(InputStream) (returns a Reader)
java.io.OutputStreamWriter(OutputStream) (returns a Writer)

![alt text](https://github.com/dpalankar/programs/blob/master/src/design/pattern/structural_adapter/adapter.png)