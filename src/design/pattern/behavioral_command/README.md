#### Command Pattern
encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command.

It is also known as Action or Transaction.

Command Pattern is used to implement lose coupling in a request-response model. In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. Command object passes the request to the appropriate method of Receiver to perform the specific action.

we can implement Command pattern. Let’s say we want to provide a File System utility with methods to open, write and close file. This file system utility should support multiple operating systems such as Windows and Unix.

To implement our File System utility, first of all we need to create the receiver classes that will actually do all the work.

Since we code in terms of interface in java, we can have FileSystemReceiver interface and it’s implementation classes for different operating system flavors such as Windows, Unix, Solaris etc.

![alt composite1](https://github.com/dpalankar/programs/blob/master/src/design/pattern/behavioral_command/command.png)

Chain of Responsibility Pattern Examples in JDK
Runnable interface (java.lang.Runnable) and Swing Action (javax.swing.Action) uses command pattern.